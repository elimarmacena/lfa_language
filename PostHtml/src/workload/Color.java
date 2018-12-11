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
public class Color extends Sketch {
    
    public final String color;
    
    public Color(String colorName){
        if (colorName.equalsIgnoreCase("red")){
            this.color = "#ff3333";
        }
        else if (colorName.equalsIgnoreCase("blue")){
            this.color = "#00a3cc";
        }
        else if (colorName.equalsIgnoreCase("black")){
            this.color = "#1a1a1a";
        }
        else if (colorName.equalsIgnoreCase("purple")){
            this.color = "#cc0099";
        }
        else if (colorName.equalsIgnoreCase("yellow")){
            this.color = "#e6e600";
        }
        else if (colorName.equalsIgnoreCase("pink")){
            this.color = "#ff6699";
        }
        else if (colorName.equalsIgnoreCase("green")){
            this.color = "#33cc33";
        }
        else if (colorName.equalsIgnoreCase("white")){
            this.color = "#ffffff";
        }
        else{
            throw new RuntimeException("ERRO: color type not found.");
        }
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
