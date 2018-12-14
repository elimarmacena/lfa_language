package workload;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Numeric extends Expr implements Comparable<Numeric> {

    public final Double value;
    
    public Numeric(Double value) {
        this.value = value;
    }

    @Override
    public Expr eval(Map<String,Expr> ctx, FileWriter fw, int identLevel, boolean changeCtx) throws IOException{
        return this;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Numeric) {
            Numeric that = (Numeric) other;
            return Objects.equals(this.value, that.value);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public int compareTo(Numeric arg0) {
        return this.value.compareTo(arg0.value);
    }
    
}
