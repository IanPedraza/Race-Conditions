package cpp2;


public class Interruption {
    
    private boolean interrption;

    public Interruption(boolean interrption) {
        this.interrption = interrption;
    }
    
    public Interruption() {
        this.interrption = true;
    }

    public boolean isInterrption() {
        return interrption;
    }

    public void setInterrption(boolean interrption) {
        this.interrption = interrption;
    }
    
}
