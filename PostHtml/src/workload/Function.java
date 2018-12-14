package workload;

public abstract class Function extends Applicable {

    protected boolean isIO = false;
    
    public Function(String jsRepr) {
        super(jsRepr);
    }
    
    public Function(String jsRepr, boolean isIO) {
        super(jsRepr);
        this.isIO = isIO;
    }
    
    @Override
    public String toString() {
        return String.format("<fn:%s>", Integer.toHexString(hashCode()));
    }
    
}
