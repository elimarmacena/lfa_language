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
public class Color extends Sketch {
    
    public final String color;
    
    public Color(String colorName){
        if (colorName.equalsIgnoreCase("red")){
            this.color = "background-color: #ff3333";
        }
        else if (colorName.equalsIgnoreCase("blue")){
            this.color = "background-color: #00a3cc";
        }
        else if (colorName.equalsIgnoreCase("black")){
            this.color = "background-color: #1a1a1a";
        }
        else if (colorName.equalsIgnoreCase("purple")){
            this.color = "background-color: #cc0099";
        }
        else if (colorName.equalsIgnoreCase("yellow")){
            this.color = "background-color: #e6e600";
        }
        else if (colorName.equalsIgnoreCase("pink")){
            this.color = "background-color: #ff6699";
        }
        else if (colorName.equalsIgnoreCase("green")){
            this.color = "background-color: #33cc33";
        }
        else if (colorName.equalsIgnoreCase("white")){
            this.color = "background-color: #ffffff";
        }
        else{
            throw new RuntimeException("ERRO: incorrect color type.");
        }
    }

    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        return this;
    }
    
}
