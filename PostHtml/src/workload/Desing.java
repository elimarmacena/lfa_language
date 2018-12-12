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
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
                "var altura = %.2f;" +
                "var largura = altura;" +
                "var rectangle = new Path2D();" +
                "rectangle.rect(10, 10, largura, altura);" +
                "ctx.fillStyle = \"%s\";"+
                "ctx.fill(rectangle);"  
               ,prop.height, prop.color );
        }
        else if (shape.value.equalsIgnoreCase("rectangle")){
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "var altura = %f;" +
            "var largura = %f;" +
            "var rectangle = new Path2D();" +
            "rectangle.rect(10, 10, largura, altura);" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill(rectangle);"
            ,prop.height, prop.width,prop.color );
        }
        else if (shape.value.equalsIgnoreCase("oval")){
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "var centerX = {X};" +
            "var centerY = {Y};" +
            "var largura = %f;" +
            "var altura = %f;" +
            "ctx.beginPath();" +
            "ctx.ellipse(centerX, centerY, largura, altura, 0, 0, 2 * Math.PI);" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();"
            ,prop.width, prop.height, prop.color );
        }
        else if (shape.value.equalsIgnoreCase("pentagon")){
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "ctx.beginPath();" +
            "ctx.strokeStyle = 'rgb(255, 0, 0)';" +
            "var Base = {x:100, y:10};" +
            "ctx.moveTo(Base.x, Base.y);" +
            "var radius = (%f*%f)/2;" +
            "var sidesNumber = 5;" +
            "for(var i=1;i<=sidesNumber; ++i){" +
            "	var th = i * 2 * Math.PI/sidesNumber;" +
            "	var x = Base.x + radius * Math.sin(th);" +
            "	var y = Base.y + radius - radius * Math.cos(th);" +
            "	ctx.lineTo(x,y);}" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();", prop.width, prop.height,prop.color);
        }
        else if(shape.value.equalsIgnoreCase("octagon")){
                this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "ctx.beginPath();" +
            "ctx.strokeStyle = 'rgb(255, 0, 0)';" +
            "var Base = {x:100, y:10};" +
            "ctx.moveTo(Base.x, Base.y);" +
            "var radius = (%f*%f)/2;" +
            "var sidesNumber = 8;" +
            "for(var i=1;i<=sidesNumber; ++i){" +
            "	var th = i * 2 * Math.PI/sidesNumber;" +
            "	var x = Base.x + radius * Math.sin(th);" +
            "	var y = Base.y + radius - radius * Math.cos(th);" +
            "	ctx.lineTo(x,y);}" +
            "ctx.fillStyle = \"%s\";"+
            "ctx.fill();", prop.width, prop.height,prop.color);
        }
        /*  ====================================================================
            |DEFINIR COMO VAI SER FEITO ESSA PORRA PORQUE AINDA NAO FACO IDEIA |
            |DEUS EH TOP                                                       |
            ====================================================================
        */
        else if (shape.value.equalsIgnoreCase("circle")){
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "var circle = new Path2D();" +
            "circle.arc({X}, {Y}, 10, 0, 2 * Math.PI); //(X DO CENTRO, Y DO CENTRO, DIAMETRO DO CIRCULO)\n" +
            "ctx.fillStyle = \"FFFFFFF\";"+
            "ctx.fill(circle);", null);
        }
        else if (shape.value.equalsIgnoreCase("triangle")){
            this.plotDraw = String.format(Locale.US,"var ctx = canvas.getContext('2d');" +
            "ctx.beginPath();" +
            "var startPlotY = {Y}; " +
            "var startPlotX = {X};" +
            "var alturaPlot = %f + startPlotY;" +
            "var larguraPlot = (startPlotX / 2) + (%f / 2);" +
            "ctx.moveTo(startPlotX, startPlotY); " +
            "ctx.lineTo((larguraPlot - startPlotX ), alturaPlot); " +
            "ctx.lineTo((startPlotX + larguraPlot), alturaPlot);" +
            "ctx.closePath();" +
            "ctx.fillStyle = \"%s\";" +
            "ctx.fill();", prop.height,prop.width,prop.color);
        }
        else if (shape.value.equalsIgnoreCase("trapezio")){
            this.plotDraw = String.format(Locale.US,"var context = canvas.getContext(\"2d\");" +
            "var altura = %f;" +
            "var largura = %f;" +
            "var beginXplot = {X};" +
            "var beginYplot = {Y}" +
            "var beginXbase = beginXplot - largura / 10;" +
            "var endXbase = beginXbase + largura;" +
            "var superiorTrap = beginXplot + largura - largura / 5;" +
            "context.moveTo(beginXplot, beginYplot);" +
            "context.lineTo(superiorTrap, beginYplot);" +
            "context.lineTo(endXbase, beginYplot + altura);" +
            "context.lineTo(beginXbase, beginYplot + altura);" +
            "context.closePath();" +
            "ctx.fillStyle = \"%s\";" +
            "context.fill();", prop.height,prop.width,prop.color);
        }
        else{
            throw new RuntimeException("ERRO:Sketch not complete");
        }
        
    }

    //@Override
    //DEPOIS NOIX VE
    //public String toString(){
    //    String output = String.format("%s (%d,%d,%s)", this.shape.value,this.prop.height,this.prop.width,this.prop.color);
    //    return output;
   // }

    @Override
    public Sketch eval(Map<String, Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        return this;
    }
}
