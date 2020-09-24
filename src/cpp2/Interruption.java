package cpp2;

public class Interruption {
    
    private boolean interruption;

    public Interruption() {
        this.interruption = false;
    }
    
    public Interruption(boolean isInterruption) {
        this.interruption = isInterruption;
    }

    public boolean isInterruption() {
        return interruption;
    }

    public void setInterruption(boolean interruption) {
        this.interruption = interruption;
    }
    
}
