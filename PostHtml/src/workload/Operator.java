package workload;

/**
 *
 * @author jefferson
 */
public abstract class Operator extends Applicable {

    public Operator(String jsRepr) {
        super(jsRepr);
    }
    
    @Override
    public String toString() {
        return jsRepr;
    }

}
