package workload;

import java.util.List;
import java.util.Scanner;
import static java.lang.String.format;

/**
 *
 * @author jefferson
 */
public class Predef {
    
    public static final Function SIN = new Function("Math.sinh") {
      
        @Override
        public Expr apply(List<Expr> params) {
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
        public Expr apply(List<Expr> params) {
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
        public Expr apply(List<Expr> params) {
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
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static final Function READ = new Function(null) {
        @Override
        public Expr apply(List<Expr> params) {
            System.out.print("? ");
            Double x = scanner.nextDouble();
            return mkNumeric(x);
        }
    };
    
    public static final Function WRITE = new Function("console.log", true) {
        @Override
        public Expr apply(List<Expr> params) {
            for (Expr x: params) {
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println();
            return UNIT;
        }
    };
    
}
