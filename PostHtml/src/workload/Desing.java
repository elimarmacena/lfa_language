/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

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
    public Sketch eval(Map<String, Sketch> ctx) {
        return this;
    }
    
}
