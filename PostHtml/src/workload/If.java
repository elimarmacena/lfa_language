package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public class If extends Expr {

    private Expr cond;
    private Expr thenExpr;
    private Expr elseExpr;

    public If(Expr cond, Expr thenExpr) {
        this(cond, thenExpr, UNIT);
    }

    public If(Expr cond, Expr thenExpr, Expr elseExpr) {
        this.cond = cond;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr result;
        Expr c = cond.eval(ctx, fw, identLevel);
        
        writeJS("if " + cond.toString() + " ",fw, identLevel);
        if (isTrue(c)) {
            result = thenExpr.eval(ctx, fw, identLevel, changeCtx);
            printElse(fw, identLevel);
            elseExpr.eval(ctx, fw, identLevel, false);
        } else {
            thenExpr.eval(ctx, fw, identLevel, false);
            printElse(fw, identLevel);
            result = elseExpr.eval(ctx, fw, identLevel, changeCtx);
        }
        
        return result;
    }
    
    private void printElse(FileWriter fw, int identLevel) throws IOException{
        if (!(elseExpr instanceof Unit)){
            writeJS("\n", fw, 0);
            writeJS("else ", fw, identLevel);
        }
    }

    @Override
    public String toString() {
        return String.format("If(%s, %s, %s)", cond, thenExpr, elseExpr);
    }

}
