/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author elmr
 */
public class Desing extends Sketch {
    public final String plotDraw;
    public Desing(Shape shape, Property prop){
        /*  ====================================================================
            |DEFINICAO DO CODIGO PARA O PLOT DA FIGURA INFORMADA PELO USUARIO.  |
            |EH FEITO USO DE LOCALE.US PARA QUE AO INSERIR UM FLOAT EM UMA STR |
            |SEJA POSTO O NUMERO SEPARADO POR . E NAO POR ,                    |
            ====================================================================
        */
        if (shape.value.equalsIgnoreCase("square")){
            this.plotDraw = String.format(Locale.US,"var altura = %s;" +
                "var squareLargura = altura;" +
                "var rectangle = new Path2D();" +
                "rectangle.rect({X}, {Y}, squareLargura, altura);" +
                "ctx.fillStyle = \"%s\";"+
                "ctx.fill(rectangle);"  
               ,prop.height.toString(), prop.color );
        }
        else if (shape.value.equalsIgnoreCase("rectangle")){
            this.plotDraw = String.format(Locale.US,"var altura = %s;" +
            "var rectangleLargura = %s;" +
            "var rectangle = new Path2D();" +
            "rectangle.rect({X}, {Y}, rectangleLargura, altura);" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill(rectangle);"
            ,prop.height.toString(), prop.width.toString(),prop.color );
        }
        else if (shape.value.equalsIgnoreCase("oval")){
            this.plotDraw = String.format(Locale.US,"var centerX = {X};" +
            "var centerY = {Y};" +
            "var ovalLargura = %s;" +
            "var ovalAltura = %s;" +
            "ctx.beginPath();" +
            "ctx.ellipse(centerX, centerY, ovalLargura, ovalAltura, 0, 0, 2 * Math.PI);" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();"
            ,prop.width.toString(), prop.height.toString(), prop.color );
        }
        else if (shape.value.equalsIgnoreCase("pentagon")){
            /*
            ====================================================================
            |O RAIO REPRESENTA A METADE DA LARGURA INFORMADA PELO USUARIO      |
            ====================================================================
            */
            this.plotDraw = String.format(Locale.US,"ctx.beginPath();" +
            "var pentagonAltura = %s;"+
            "var begin ={x:{X},y:{Y}};"+
            "var Base = {x:begin.x, y:(pentagonAltura+begin.y)};" +
            "ctx.moveTo(Base.x, Base.y);" +
            "var radius = (%s / 2);" +
            "var sidesNumber = 5;" +
            "for(var i=1;i<=sidesNumber; ++i){" +
            "	var th = i * 2 * Math.PI/sidesNumber;" +
            "	var x = Base.x + radius * Math.sin(th);" +
            "	var y = Base.y  + radius - radius * Math.cos(th);" +
            "	ctx.lineTo(x,y);}" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();", prop.height.toString(), prop.width.toString(),prop.color);
        }
        else if(shape.value.equalsIgnoreCase("octagon")){
            /*
            ====================================================================
            |O RAIO REPRESENTA A METADE DA LARGURA INFORMADA PELO USUARIO      |
            ====================================================================
            */
            this.plotDraw = String.format(Locale.US,"ctx.beginPath();" +
            "var alturaOctagon = %s;"+
            "var begin ={x:{X},y:{Y}};"+
            "var Base = {x:begin.x, y:(alturaOctagon+begin.y)};" +
            "ctx.moveTo(Base.x, Base.y);" +
            "var radius = (%s / 2);" +
            "var sidesNumber = 8;" +
            "for(var i=1;i<=sidesNumber; ++i){" +
            "	var th = i * 2 * Math.PI/sidesNumber;" +
            "	var x = Base.x + radius * Math.sin(th);" +
            "	var y = Base.y  + radius - radius * Math.cos(th);" +
            "	ctx.lineTo(x,y);}" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();", prop.height.toString(), prop.width.toString(),prop.color);
        }
        
        else if (shape.value.equalsIgnoreCase("circle")){
            this.plotDraw = String.format(Locale.US,"var circle = new Path2D();" +
            "circle.arc({X}, {Y}, %s, 0, 2 * Math.PI);" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill(circle);", prop.height.toString(),prop.color);
        }
        else if (shape.value.equalsIgnoreCase("triangle")){
            this.plotDraw = String.format(Locale.US,"ctx.beginPath();" +
            "var startPlotY = {Y}; " +
            "var startPlotX = {X};" +
            "var alturaPlot = %s + startPlotY;" +
            "var larguraPlot = (startPlotX / 2) + (%s / 2);" +
            "ctx.moveTo(startPlotX, startPlotY); " +
            "ctx.lineTo((larguraPlot - startPlotX ), alturaPlot); " +
            "ctx.lineTo((startPlotX + larguraPlot), alturaPlot);" +
            "ctx.closePath();" +
            "ctx.fillStyle = \"%s\";" +
            "ctx.fill();", prop.height.toString(),prop.width.toString(),prop.color);
        }
        else if (shape.value.equalsIgnoreCase("trapezio")){
            this.plotDraw = String.format(Locale.US,"var altura = %s;" +
            "var trapezioLargura = %s;" +
            "var beginXplot = {X};" +
            "var beginYplot = {Y}" +
            "var beginXbase = beginXplot - trapezioLargura / 10;" +
            "var endXbase = beginXbase + trapezioLargura;" +
            "var superiorTrap = beginXplot + trapezioLargura - trapezioLargura / 5;" +
            "context.moveTo(beginXplot, beginYplot);" +
            "context.lineTo(superiorTrap, beginYplot);" +
            "context.lineTo(endXbase, beginYplot + altura);" +
            "context.lineTo(beginXbase, beginYplot + altura);" +
            "context.closePath();" +
            "ctx.fillStyle = \"%s\";" +
            "context.fill();", prop.height.toString(),prop.width.toString(),prop.color);
        }
        else{
            throw new RuntimeException("ERRO:Sketch not complete");
        }
        
    }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        return this;
    }

    @Override
    public String toString() {
        return plotDraw;
    }
}
