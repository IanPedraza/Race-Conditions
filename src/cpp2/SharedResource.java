package cpp2;


public class SharedResource extends Thread{
    
    private static final int INTERRUPTS_SIZE = 2;
    
    private String datoCompartido;
    private Interruption[] interrupts;

    public SharedResource() {
        this.datoCompartido = "";
        this.interrupts = new Interruption[INTERRUPTS_SIZE];
        initInterrupts();
    }    
    
    private void initInterrupts () {
        for (int i = 0; i < INTERRUPTS_SIZE; i++) {
            interrupts[i] = new Interruption();
        }
    }

    public String getDatoCompartido() {
        lock();
        System.out.println("the resource has been read");
            
        return datoCompartido;        
    }

    public void setDatoCompartido(String datoCompartido) {
        lock();
        System.out.println("the resource has been written");
            
        this.datoCompartido = datoCompartido;        
    }
    
    public boolean isLocked() {
        
        for (int i = 0; i < INTERRUPTS_SIZE; i++) {            
            if (interrupts[i].isInterruption()) {
                return true;
            }
        }
        
        return false;
    }
    
    private void lock() {
        for (int i = 0; i < INTERRUPTS_SIZE; i++) {            
            interrupts[i].setInterruption(true);
        }
    }
    
}
