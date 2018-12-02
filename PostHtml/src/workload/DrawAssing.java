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
public class DrawAssing extends Sketch{
    private final String drawName;
    private final Draw draw;
    
    public DrawAssing(String drawName, Sketch draw){
        this.drawName = drawName;
        this.draw = (Draw)draw;
    }
    
    @Override
    public Sketch eval(Map<String, Sketch> ctx) {
        Sketch data = draw.eval(ctx);
        ctx.put(drawName, data);
        return data;
    }
    
    @Override
    public String toString(){
        return String.format("skt %s = %s", this.drawName,this.draw.toString());
    }
    
}
