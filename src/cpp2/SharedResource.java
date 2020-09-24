package cpp2;


public class SharedResource extends Thread{
    
    private String datoCompartido;
    private final Lock lock;

    public SharedResource() {
        this.datoCompartido = "";
        this.lock = new Lock();
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
        return lock.isLocked();
    }
    
    private void lock() {
        lock.setLock(true);
    }
    
}
