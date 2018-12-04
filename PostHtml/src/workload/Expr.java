package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class Expr {

    public abstract Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException;
    public Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel) throws IOException{
        return eval(ctx,fw, identLevel,true);
    }
    
    protected void writeJS(String jsCode, FileWriter fw, int identLevel) throws IOException{
        if (fw != null) fw.write(String.join("", Collections.nCopies(identLevel * 4, " "))+jsCode);
    }
    
    public static final Unit UNIT = new Unit();
    
    public static final Numeric ZERO = new Numeric(0.0);
    
    public static final Numeric ONE = new Numeric(1.0);
    
    public static boolean isFalse(Expr x) {
        return (x instanceof Numeric) && ((Numeric) x).value == 0;
    }
        
    public static boolean isTrue(Expr x) {
        return !isFalse(x);
    }
    
    public static Expr mkNumeric(Double value) {
        return new Numeric(value);
    }
    
    public static Expr mkVar(String name) {
        return new Variable(name);
    }
    
    public static Expr mkComposite(Applicable app, Expr... args) {
        return new CompositeExpr(app, args);
    }
    
    public static Expr mkAssign(String name, Expr expr) {
        return new Assign(name, expr);
    }
    
    public static Expr mkFunCall(String fname, Expr... args) {
        return mkFunCall(fname, Arrays.asList(args));
    }
    
    public static Expr mkFunCall(String fname, List<Expr> args) {
        return new FunCall(fname, args);
    }
    
    public static Expr mkIf(Expr cond, Expr thenExpr) {
        return new If(cond, thenExpr);
    }
    
    public static Expr mkIf(Expr cond, Expr thenExpr, Expr elseExpr) {
        return new If(cond, thenExpr, elseExpr);
    }
    
    public static Expr mkWhile(Expr cond, Expr doExpr) {
        return new While(cond, doExpr);
    }
    
    public static Expr mkBlock(List<Expr> exprList) {
        return new Block(exprList);
    }
}
