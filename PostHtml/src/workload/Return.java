/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author joel-
 */
public class Return extends Expr{

    public Expr expr;

    public Return(Expr expr) {
        this.expr = expr;
    }
    
    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        expr.eval(ctx, null, identLevel);
        writeJS("return ", fw, identLevel);
        writeJS(expr.toString(), fw, 0);
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s", expr.toString())  ;
    }    
    
}
