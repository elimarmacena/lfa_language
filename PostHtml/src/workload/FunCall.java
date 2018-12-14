package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FunCall extends Expr {
    
    private final String fname;
    private final List<Expr> args;
    private String jsRepr;
    
    public FunCall(String fname, List<Expr> args) {
        this.fname = fname;
        this.args = args;
    }
    
    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr x = ctx.get(fname);
        if (x == null) {
            throw new RuntimeException("Undefined function: " + fname);
        }
        if (!(x instanceof Applicable)) {
            throw new RuntimeException("Unable to apply value: " + String.valueOf(x));
        }
        Applicable f = (Applicable) x;
        boolean isToPrint = !(f instanceof Function && ((Function)f).isIO);
        List<Expr> params = new LinkedList<>();
        for (Expr e: args) {
            Expr y = e.eval(ctx,isToPrint ? fw : null,0);
            params.add(y);
        }
        
        jsRepr = f.jsRepr;
        
    return f.apply(params, ctx, fw, identLevel);
    }
    
    @Override
    public String toString() {
        List<String> xs = args.stream().map(x -> x.toString()).collect(Collectors.toList());
        String s = String.join(", ", xs);
        return String.format("%s(%s)", (jsRepr != null) ? jsRepr : fname, s);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof FunCall) {
            FunCall that = (FunCall) other;
            return this.fname.equals(that.fname) && this.args.equals(that.args);
        }
        else {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.fname);
        hash = 47 * hash + Objects.hashCode(this.args);
        return hash;
    }
}
