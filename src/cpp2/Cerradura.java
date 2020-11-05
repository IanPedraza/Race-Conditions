package cpp2;

public class Cerradura {
    
    private boolean lock;

    public Cerradura() {
        this.lock = false;
    }
    
    public Cerradura(boolean isInterruption) {
        this.lock = isInterruption;
    }

    public boolean isLocked() {
        return lock;
    }

    public void lock() {
        this.lock = true;
    }
    
    public void unlock() {
        this.lock = false;
    }
    
}
