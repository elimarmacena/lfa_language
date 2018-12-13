/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.format;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author elmr
 */
public class UserFunction extends Function{
    private final String fname;
    private final List<Expr> args;
    private Block code;
    
    public UserFunction(String fname, List<Expr> args,Block code) {
        super(fname);
        this.fname = fname;
        this.args = args;
        this.code = code;
    }

    @Override
    public Expr apply(List<Expr> params, Map<String, Expr> ctx, FileWriter fw, int identLevel) throws IOException {
        if (params.size() != args.size()) {
            String msg = format(
                        "Wrong number of arguments. Expecting %d; Found: %d.", 
                        args.size(),params.size());
            throw new IllegalArgumentException(msg);
        }
        
        Map<String, Expr> newCtx = new LinkedHashMap<>();
        newCtx.putAll(ctx);
        
        for (int i = 0; i < params.size(); i++){
            newCtx.put(args.get(i).toString(), params.get(i));
        }
        Expr result = code.eval(newCtx, null, identLevel);
        
        List<String> paramsStr = params.stream().map(x -> x.toString()).collect(Collectors.toList());
        String paramsJoin = "(" +String.join(", ", paramsStr) + ")";
        
        writeJS(fname + paramsJoin, fw, identLevel);
        
        return result;
    }
    
    
    @Override
    public Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        ctx.put(fname, this);
        
        List<String> argsStr = args.stream().map(x -> x.toString()).collect(Collectors.toList());
        String argsJoin = "(" +String.join(", ", argsStr) + ")";
        
        writeJS("\n", fw, 0);
        String declaration = String.format("var %s = function %s ", fname, argsJoin);
        writeJS(declaration, fw, identLevel);
        
        Map<String, Expr> newCtx = new LinkedHashMap<>();
        newCtx.putAll(ctx);
        
        code.eval(newCtx, fw, identLevel);
        writeJS(";", fw, identLevel);
        
        return this;
    }
    
    
}
