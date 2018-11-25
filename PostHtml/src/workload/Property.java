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
public class Property extends Sketch {
    
    public final int height;
    public final int width;
    public final String color;
    
    public Property(int height, int width, String color){
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        return this;
    }
    
}
