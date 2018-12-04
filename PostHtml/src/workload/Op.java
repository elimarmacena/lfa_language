package workload;


import java.util.List;

/**
 *
 * @author jefferson
 */
public class Op {
    
    // =========================================================================
    // Arithmetic operators
    // =========================================================================
    
    public static final Operator PLUS = new Operator("+") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = x + y;
            return mkNumeric(z);
        }
    };
    
    public static final Operator MINUS = new Operator("-") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = x - y;
            return mkNumeric(z);
        }
    };
    
    public static final Operator TIMES = new Operator("*") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = x * y;
            return mkNumeric(z);
        }
    };
    
    public static final Operator DIVIDE = new Operator("/") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = x / y;
            return mkNumeric(z);
        }
    };
    
    public static final Operator MOD = new Operator("%") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = x % y;
            return mkNumeric(z);
        }
    };
    
    public static final Operator EXP = new Operator("^") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            Double y = ((Numeric)params.get(1)).value;
            Double z = Math.pow(x, y);
            return mkNumeric(z);
        }
    };
    
    public static final Operator UMINUS = new Operator("-") {
        @Override
        public Expr apply(List<Expr> params) {
            Double x = ((Numeric)params.get(0)).value;
            return mkNumeric(-x);
        }
    };
    
    
    // =========================================================================
    // Relational operators
    // =========================================================================
    
    public static final Operator EQU = new Operator("===") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr x = params.get(0);
            Expr y = params.get(1);
            return x.equals(y) ? ONE : ZERO;
        }
    };
        
    public static final Operator NEQ = new Operator("!==") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr x = params.get(0);
            Expr y = params.get(1);
            return x.equals(y) ? ZERO : ONE;
        }
    };
    
    public static final Operator LT = new Operator("<") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr a = params.get(0);
            Expr b = params.get(1);
            if ((a instanceof Numeric) && (b instanceof Numeric)) {
                Numeric x = (Numeric) a;
                Numeric y = (Numeric) b;
                return x.compareTo(y) < 0 ? ONE : ZERO;
            }
            else {
                String msg = String.format(
                        "Values are not comparable: [%s] and [%s].", a, b);
                throw new IllegalArgumentException(msg);
            }
        }
    };
        
    public static final Operator LEQ = new Operator("<=") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr a = params.get(0);
            Expr b = params.get(1);
            if ((a instanceof Numeric) && (b instanceof Numeric)) {
                Numeric x = (Numeric) a;
                Numeric y = (Numeric) b;
                return x.compareTo(y) <= 0 ? ONE : ZERO;
            }
            else {
                String msg = String.format(
                        "Values are not comparable: [%s] and [%s].", a, b);
                throw new IllegalArgumentException(msg);
            }
        }
    };
    
    public static final Operator GT = new Operator(">") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr a = params.get(0);
            Expr b = params.get(1);
            if ((a instanceof Numeric) && (b instanceof Numeric)) {
                Numeric x = (Numeric) a;
                Numeric y = (Numeric) b;
                return x.compareTo(y) > 0 ? ONE : ZERO;
            }
            else {
                String msg = String.format(
                        "Values are not comparable: [%s] and [%s].", a, b);
                throw new IllegalArgumentException(msg);
            }
        }
    };
    
    public static final Operator GEQ = new Operator(">=") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr a = params.get(0);
            Expr b = params.get(1);
            if ((a instanceof Numeric) && (b instanceof Numeric)) {
                Numeric x = (Numeric) a;
                Numeric y = (Numeric) b;
                return x.compareTo(y) >= 0 ? ONE : ZERO;
            }
            else {
                String msg = String.format(
                        "Values are not comparable: [%s] and [%s].", a, b);
                throw new IllegalArgumentException(msg);
            }
        }
    };
    
    
    // =========================================================================
    // Logic operators
    // =========================================================================
    
    public static final Operator OR = new Operator("or") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr x = params.get(0);
            Expr y = params.get(1);
            return (isTrue(x) || isTrue(y)) ? ONE : ZERO;
        }
    };
    
    public static final Operator AND = new Operator("and") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr x = params.get(0);
            Expr y = params.get(1);
            return (isTrue(x) && isTrue(y)) ? ONE : ZERO;
        }
    };
    
    public static final Operator NOT = new Operator("not") {
        @Override
        public Expr apply(List<Expr> params) {
            Expr x = params.get(0);
            return isTrue(x) ? ZERO : ONE;
        }
    };
    
}
