package cpp2;

public class Lock {
    
    private boolean lock;

    public Lock() {
        this.lock = false;
    }
    
    public Lock(boolean isInterruption) {
        this.lock = isInterruption;
    }

    public boolean isLocked() {
        return lock;
    }

    public void setLock(boolean interruption) {
        this.lock = interruption;
    }
    
}
