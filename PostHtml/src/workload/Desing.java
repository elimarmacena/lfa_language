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
 * @author elmr
 */
public class Desing extends Sketch {
    public final Shape shape;
    public final Property prop;
    
    public Desing(Shape shape, Property prop){
        this.shape = shape;
        this.prop = prop;
    }
    
    
    @Override
    public String toString(){
        String output = String.format("%s (%d,%d,%s)", this.shape.value,this.prop.height,this.prop.width,this.prop.color);
        return output;
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
