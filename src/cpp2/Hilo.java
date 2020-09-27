package cpp2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Hilo extends Thread {
    
    private JTextArea textArea;
    private JLabel labelKilled;
    private SharedResource sharedResource;
    private Boolean isRunning = true;

    public Hilo(JTextArea textArea, JLabel labelKilled, SharedResource sharedResource) {
        this.textArea = textArea;
        this.sharedResource = sharedResource;
        this.labelKilled = labelKilled;
    }
    
    @Override
    public void run() {
        while(isRunning) { 
            if (sharedResource.isLocked()) {
                System.out.println(getName() + ": Cannot access this thread right now");
                return;
            }
            
            this.sharedResource.setDatoCompartido(this.getName());
            this.textArea.append(this.sharedResource.getDatoCompartido() + "\n");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    public void pause() {
        this.isRunning = false;
    }
    
    public void kill() {
        try {
            this.isRunning = false;
            this.interrupt();
            this.labelKilled.setText("Killed thread: " + getName());
            System.out.println(getName() + " thread has been killed");
        } catch (Exception e) {
            
        }
    }
    
}
