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
        Expr value = expr.eval(ctx, (expr instanceof Variable) ? null : fw, identLevel);
        
        if (fw != null){
            Expr e = ctx.get(varName);
            
            String valueStr = null;
            if (changeCtx)  valueStr = value.toString();
            else            valueStr = expr.toString();
            
            if(e != null && e instanceof Numeric) writeJS(varName + " = " + valueStr, fw, identLevel);
            else writeJS("var " + varName + " = " + valueStr, fw, identLevel);
        }
        
        if (changeCtx) ctx.put(varName, value);

        return value;
    }
    
    @Override
    public String toString() {
        String sx = expr.toString();
        return String.format("Assign(%s, %s)", varName, sx);
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
