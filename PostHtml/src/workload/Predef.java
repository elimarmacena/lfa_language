package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static java.lang.String.format;
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
    FUNCAO RESPONSAVEL PARA DESENHAR LINAHS NO CANVAS, TRABALHA COM DOIS 
    PARAMETROS
    ============================================================================
    */
    public static final Function DRAWLINE = new Function(null){
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel){
            if(params.size() != 2){
                String msg = format(
                        "Wrong number of arguments. Expecting 2; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);

            }
            Numeric beginX = (Numeric) params.get(0);
            Numeric endY = (Numeric) params.get(1);
            String drawLine = String.format("var ctx = c.getContext(\"2d\");\n ctx.moveTo(0, 0);\n ctx.lineTo(%f, %f);\n ctx.stroke();", beginX,endY);
            return UNIT;
        }
    };
    
    public static final Function DRAW = new Function(null,true) {
        @Override
        public Expr apply(List<Expr> params, Map<String,Expr> ctx, FileWriter fw, int identLevel) throws IOException {
            if(params.size() != 3){
                String msg = format(
                        "Wrong number of arguments. Expecting 3; Found: %d.", 
                        params.size());
                throw new IllegalArgumentException(msg);

            }
            Numeric beginX = (Numeric) params.get(0);
            Numeric endY = (Numeric) params.get(1);
            Desing result = (Desing) params.get(2).eval(ctx, null, identLevel, false);
            String plot = result.plotDraw;
            writeJS(plot, fw, identLevel);
            return UNIT;
        }
    };
    
}
