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
public class Shape extends Sketch{
    public final String value;
    
    public Shape(String nameShape){
        this.value= "";
        if(nameShape.equalsIgnoreCase("square")){
            //html para quadrado
        }
        else if (nameShape.equalsIgnoreCase("rectangle")){
            //html para retangulo
        }
        else if (nameShape.equalsIgnoreCase("oval")){
            //html para forma oval
        }
        else if (nameShape.equalsIgnoreCase("star")){
            //html para estrela
        }
        else if (nameShape.equalsIgnoreCase("pentagon")){
            //html para pentagono
        }
        else if (nameShape.equalsIgnoreCase("hexagon")){
            //html para hexagono
        }
        else if (nameShape.equalsIgnoreCase("octagon")){
            //html para octagono
        }
        else if (nameShape.equalsIgnoreCase("heart")){
            //html para coracao
        }
        else if (nameShape.equalsIgnoreCase("circle")){
            //html para circulo
        }
        else if (nameShape.equalsIgnoreCase("triangle")){
            //html para triangulo
        }
        else if (nameShape.equalsIgnoreCase("trapezio")){
            //html para trapezio
        }
        else{
            throw new RuntimeException("ERRO: shape type not found.");
        }
    }
    
    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        return this;
    }
    
}
