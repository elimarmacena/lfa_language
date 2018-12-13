/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author elmr
 */
public class UserFunction extends Sketch{
    private final String fname;
    private final List<Expr> args;
    private Block code;
    
    public UserFunction(String fname, List<Expr> args,Block code) {
        this.fname = fname;
        this.args = args;
        this.code = code;
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        ctx.put(this.fname, this.code);
        return this;
    }
    
}
