package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class Block extends Expr {

    private final List<Expr> exprList;

    public Block(List<Expr> exprList) {
        this.exprList = exprList;
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr result = UNIT;
        writeJS("{",fw, 0);
        for(Expr e: exprList) {
            writeJS("\n",fw, identLevel);
            result = e.eval(ctx, fw, identLevel + 1, changeCtx);
            if (e instanceof Return) break;
        }
        writeJS("\n",fw, 0);
        writeJS("}",fw, identLevel);
        return result;
    }
    
    @Override
    public String toString() {
        List<String> xs = exprList.stream().map(x -> x.toString()).collect(Collectors.toList());
        String xss = String.join("\t; ", xs);
        return String.format("{\n%s\n}", xss);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Block) {
            Block that = (Block) other;
            return this.exprList.equals(that.exprList);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.exprList);
        return hash;
    }
}
