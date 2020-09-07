package cpp2;

import javax.swing.JTextArea;

public class Hilo extends Thread {
    
    private JTextArea textArea;
    private SharedResource sharedResource;
    private Boolean isRunning = true;

    public Hilo(JTextArea textArea, SharedResource sharedResource) {
        this.textArea = textArea;
        this.sharedResource = sharedResource;
    }
    
    @Override
    public void run() {
        while(isRunning) {
            try {
                this.sharedResource.setDatoCompartido(this.getName());
                this.textArea.append(this.sharedResource.getDatoCompartido() + "\n");
                sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void pause() {
        this.isRunning = false;
    }
    
}
