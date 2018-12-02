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
public class Draw extends Sketch {
    private final Desing desing;
    
    public Draw(Sketch desing){
        this.desing = (Desing)desing;
    }
    
    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        return this;
    }
    
    @Override
    public String toString(){
        String output = String.format("Draw(%s)", this.desing.toString());
        return output;
    }
    
}
