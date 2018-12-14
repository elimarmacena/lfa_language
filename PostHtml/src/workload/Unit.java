package workload;

import java.io.FileWriter;
import java.util.Map;

public class Unit extends Expr {
    
    // The constructor is 'package private'.
    Unit() {}

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) {
        return this;
    }
    
    @Override
    public String toString() {
        return "()";
    }
    
}
