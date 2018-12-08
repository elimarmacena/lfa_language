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
public class Property extends Sketch {
    
    public final double height;
    public final double width;
    public final String color;
    
    public Property(double height, double width, String color){
        this.height =  height;
        this.width = width;
        this.color = color;
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
