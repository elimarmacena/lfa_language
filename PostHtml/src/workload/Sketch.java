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
public abstract class Sketch {
    public abstract Sketch eval(Map<String,Sketch>ctx);
    
    public static Sketch mkNumber(int value){
        return new Number(value);
    }
    
    public static Sketch mkColor(String colorName){
        return new Color(colorName);
    }
}
