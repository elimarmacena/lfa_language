package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Variable extends Expr {

    private final String name;
    
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException {
        Expr result = ctx.get(name);
        if (result == null) {
            throw new RuntimeException("Undefined variable: " + name);
        }
        else {
            writeJS(name,fw, identLevel);
            return result;
        }
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Variable) {
            Variable that = (Variable) other;
            return this.name.equals(that.name);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
}
