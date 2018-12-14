package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author jefferson
 */
public class Assign extends Expr {

    private final String varName;
    private final Expr expr;
    
    public Assign(String varName, Expr x) {
        this.varName = varName;
        this.expr = x;
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr value = expr.eval(ctx, (expr instanceof Variable || expr instanceof FunCall) ? null : fw, identLevel);
        
        if (fw != null){
            Expr e = ctx.get(varName);
            
            if(e != null) writeJS(varName + " = " + expr.toString(), fw, identLevel);
            else          writeJS("var " + varName + " = " + expr.toString(), fw, identLevel);
        }
        
        ctx.put(varName, value);

        return value;
    }
    
    @Override
    public String toString() {
        String sx = expr.toString();
        return String.format("%s = %s", varName, sx);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Assign) {
            Assign that = (Assign) other;
            return this.varName.equals(that.varName) && this.expr.equals(that.expr);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.varName);
        hash = 97 * hash + Objects.hashCode(this.expr);
        return hash;
    }
    
}
