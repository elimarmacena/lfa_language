package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public class While extends Expr {
    
    private final Expr cond;
    private final Expr doExpr;
    
    public While(Expr cond, Expr doExpr) {
        this.cond = cond;
        this.doExpr = doExpr;
    }
    
    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr result = UNIT;
        Expr c = cond.eval(ctx, fw, identLevel);
        
        writeJS("while " + cond.toString() + " ", fw, 0);
        doExpr.eval(ctx, fw, identLevel, false);
        while (isTrue(c)) {
            result = doExpr.eval(ctx, null, identLevel);
            c = cond.eval(ctx, fw, identLevel + 1);
        }
        return result;
    }
    
    @Override
    public String toString() {
        return String.format("While(%s, %s)", cond, doExpr);
    }
    
}
