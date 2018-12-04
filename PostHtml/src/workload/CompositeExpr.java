package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author jefferson
 */
public class CompositeExpr extends Expr {

    private final Applicable app;
    private final List<Expr> subexprs;
    
    public CompositeExpr(Applicable op, List<Expr> subexprs) {
        this.app = op;
        this.subexprs = subexprs;
    }
    
    public CompositeExpr(Applicable op, Expr... exprs) {
        this(op, Arrays.asList(exprs));
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        LinkedList<Expr> params = new LinkedList<>();
        for (Expr x: subexprs) {
            Expr y = x.eval(ctx, null, identLevel);
            params.add(y);
        }
        Expr result = app.apply(params);
        return result;
    }
    
    @Override
    public String toString() {
        List<String> xs = subexprs.stream().map(x -> x.toString()).collect(Collectors.toList());
        return "(" +String.join(" " + app + " ", xs) + ")";
    }
    
}