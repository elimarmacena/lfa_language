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
public class DrawAssing extends Sketch{
    private final String drawName;
    private final Sketch draw;
    
    public DrawAssing(String drawName, Sketch draw){
        this.drawName = drawName;
        this.draw = draw;
    }
    
    @Override
    public String toString(){
        return draw.toString();
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Sketch data = (Sketch) draw.eval(ctx,fw,identLevel,changeCtx);
        ctx.put(drawName, data);
        return data;
    }
    
}
