package workload;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class Applicable extends Expr {

    // Stores the string representation in js
    protected final String jsRepr;
    
    public Applicable(String jsRepr) {
        this.jsRepr = jsRepr;
    }
    
    public abstract Expr apply(List<Expr> params);
    
    @Override
    public Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) {
        return this;
    }
    
}
