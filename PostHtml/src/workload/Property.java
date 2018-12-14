package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Property extends Sketch {
    
    public final Expr height;
    public final Expr width;
    public final String color;
    
    public Property(Expr height, Expr width, String color){
        this.height =  height;
        this.width = width;
        this.color = color;
    }
    
    public Property(Expr height,String color){
        this.height =  height;
        this.width = Expr.UNIT;
        this.color = color;
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        return this;
    }

    
    
}
