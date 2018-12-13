/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author elmr
 */
public abstract class Sketch extends Expr {
    

    
    public static Sketch mkColor(String colorName){
        return new Color(colorName);
    }
    
    public static Sketch mkProperty(Expr height, Expr width, Sketch color){
        return new Property((Numeric)height, (Numeric)width, ((Color)color).color);
    }
    //USADO EM FIGURAS QUE NECESSITAM DE APENAS UM PARAMETRO (CIRCLE E SQUARE)
    public static Sketch mkProperty(Expr height, Sketch color){
        return new Property((Numeric)height, ((Color)color).color);
    }
    
    public static Sketch mkShape(String shapeName){
        return new Shape(shapeName);
    }
    
    public static Sketch mkDesign(Sketch shape,Sketch prop){
        return new Desing(((Shape)shape), ((Property)prop));
    }
    
    public static Sketch mkDrawAssing(String drawName, Sketch draw){
        return new DrawAssing(drawName, draw);
    }
}
