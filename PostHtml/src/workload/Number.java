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
public class Number extends Sketch{

    public final int value;
    
    public Number(int value){
        this.value = value;
    }
    
    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        
        return this;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
    
}
