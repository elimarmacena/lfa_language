package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static java.lang.String.format;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public class Predef {
    
    public static final Function SIN = new Function("Math.sinh") {
      
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) {
            if (params.size() != 1) {
                String msg = format(
                        "Wrong number of arguments. Expecting 1; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);
            }
            Numeric x = (Numeric) params.get(0);
            Double y = Math.sin(x.value);
            return Expr.mkNumeric(y);
        }
        
    };
    
    public static final Function COS = new Function("Math.cosh") {
      
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) {
            if (params.size() != 1) {
                String msg = format(
                        "Wrong number of arguments. Expecting 1; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);
            }
            Numeric x = (Numeric) params.get(0);
            Double y = Math.cos(x.value);
            return mkNumeric(y);
        }
        
    };
    
    public static final Function TAN = new Function("Math.tanh") {
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) {
            if (params.size() != 1) {
                String msg = format(
                        "Wrong number of arguments. Expecting 1; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);
            }
            Numeric x = (Numeric) params.get(0);
            Double y = Math.tan(x.value);
            return mkNumeric(y);
        }
    };
    
    public static final Function WRITE = new Function("console.log", true) {
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) {
            for (Expr x: params) {
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println();
            return UNIT;
        }
    };
    
    /*
    ============================================================================
    |FUNCAO RESPONSAVEL PARA DESENHAR LINAHS NO CANVAS, TRABALHA COM QUARTRO   |
    |PARAMETROS, X E Y INICIAL E X E Y FINAL DA LINHA A SER PLOTADA.           |
    ============================================================================
    */
    public static final Function DRAWLINE = new Function(null){
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) throws IOException{
            if(params.size() != 4){
                String msg = format(
                        "Wrong number of arguments. Expecting 4; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);

            }
            String beginX = params.get(0).toString();
            String beginY = params.get(1).toString();
            String endX = params.get(2).toString();
            String endY = params.get(3).toString();
            String drawLine = String.format(Locale.US,"ctx.moveTo(%s, %s);\n ctx.lineTo(%s, %s);\n ctx.stroke();", beginX, beginY, endX, endY);
            writeJS(drawLine, fw, identLevel);
            return UNIT;
        }
    };
    /*
    ============================================================================
    |FUNCAO RESPONSAVEL PARA QUE SEJA EXIBIDA A IMAGEM PREVIAMENTE ESTABELECIDA|
    |EH NECESSARIO INFORMAR O X,Y INICIAL DO PLOT, ALEM DO DESENHO A SER FEITO |
    ============================================================================
    */
    public static final Function DRAW = new Function(null,true) {
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) throws IOException {
            if(params.size() != 3){
                String msg = format(
                        "Wrong number of arguments. Expecting 3; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);
            }
            Desing result = (Desing) params.get(2).eval(ctx, null, identLevel, false);
            String plot = result.plotDraw;
            
            boolean isToApply = !ctx.values().stream().anyMatch(x -> x instanceof Unit);
            if (isToApply) {
                Numeric plotX = (Numeric) params.get(0);
                Numeric plotY = (Numeric) params.get(1);
                plot = plot.replace("{X}", String.valueOf(plotX));
                plot = plot.replace("{Y}", String.valueOf(plotY));
            }else {
                plot = plot.replace("{X}", params.get(0).toString());
                plot = plot.replace("{Y}", params.get(1).toString());
            }
            
            writeJS(plot, fw, identLevel);
            return UNIT;
        }
    };
    
}
