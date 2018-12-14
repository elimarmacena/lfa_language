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
