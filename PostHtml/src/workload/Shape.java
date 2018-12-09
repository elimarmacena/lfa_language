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
        if(nameShape.equalsIgnoreCase("square")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("rectangle")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("oval")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("star")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("pentagon")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("hexagon")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("octagon")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("heart")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("circle")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("triangle")){
            this.value = nameShape;
        }
        else if (nameShape.equalsIgnoreCase("trapezio")){
            this.value = nameShape;
        }
        else if(nameShape.equalsIgnoreCase("page")){
            this.value = nameShape;
        }
        else{
            throw new RuntimeException("ERRO: shape type not found.");
        }
    }

    @Override
    public Expr eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        return this;
    }
    

    
}
