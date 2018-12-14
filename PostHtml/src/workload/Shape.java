package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Shape extends Sketch{
    public final String value;
    
    public Shape(String nameShape){
        this.value = nameShape;
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        return this;
    }
    

    
}
