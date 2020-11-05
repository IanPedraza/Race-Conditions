package cpp2;

import static cpp2.Algorithms.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Hilo extends Thread {

    private final static int inicio = 500;
    private final static int fin = 2000;

    private int i;

    private boolean pause;
    
    private JTextArea textArea;
    private JLabel labelKilled;
    private SharedResource sharedResource;
    private Boolean dead;

    private Cerradura lock;
    private Lock mutex;
    private Mutex mutex_art;

    public Hilo(int i, JTextArea textArea, JLabel labelKilled, SharedResource sharedResource, Cerradura lock) {
        this.dead = false;

        this.textArea = textArea;
        this.sharedResource = sharedResource;
        this.labelKilled = labelKilled;
        this.lock = lock;
        this.mutex = new ReentrantLock();
        this.mutex_art = new Mutex();
        this.i = i;
        this.pause = true;
    }

    @Override
    public void run() {
        int j;

        while (pause) {
            try {
                if (sharedResource.getAlgorithm() == DIJKSTRA) {
                    sharedResource.getB()[i] = false; //Indico que estoy en bucle

                    while (sharedResource.getK() != i) { //Mientras no sea mi turno
                        sharedResource.getC()[i] = true; //Indico que no estoy en seccion critica

                        if (sharedResource.getB()[sharedResource.getK()]) { //Si el hilo en turno ya salió
                            //k = i;  //Tomo el turno
                            sharedResource.setK(i);
                            //Go to if (k!=i)
                        } else {
                            sharedResource.getC()[i] = false;   //Indico que voy a entrar en sc

                            for (j = 0; j < SharedResource.N; j++) {
                                if (j != i && !sharedResource.getC()[j]) //Si encuentro algun proceso que vaya a entrar en sc, me salgo
                                {
                                    break; //Go to if (k!=i)
                                }
                            }
                        }
                    }


                    /* ENTRAMOS A LA SECCION CRITICA */
                    sharedResource.getC()[i] = true;    //desactivo mis bloqueos
                    sharedResource.getB()[i] = true;    //desactivo mis bloqueos

                    sharedResource.setDatoCompartido(this.getName());
                    textArea.append(sharedResource.getDatoCompartido() + ": eats \n");

                    Thread.sleep((int) (inicio + Math.random() * fin));

                    if (isDead()) {
                        kill();
                    }

                } else if (sharedResource.getAlgorithm() == DEKKER) {
                    sharedResource.getBdek()[i] = true;    // Está listo para acceder a la Sección Crítica

                    while (sharedResource.getTurno() != i) { // Mientras el otro esté procesando
                        sharedResource.getBdek()[i] = false;   // indicar que no estoy listo
                        while (sharedResource.getTurno() != i) { /* esperar activamente. */ }
                        sharedResource.getBdek()[i] = true;
                    }

                    /* AQUI HACER LA Sección crítica */
                    sharedResource.setDatoCompartido(this.getName());
                    textArea.append(sharedResource.getDatoCompartido() + ": eats \n");

                    Thread.sleep((int) (inicio + Math.random() * fin));

                    if (isDead()) {
                        kill();
                    }

                    sharedResource.nextTurno(); // Indicar el turno del otro proceso
                    sharedResource.getBdek()[i] = false;  // Indicar que ya no está listo (para acceder a la Sección Crítica)                
                } else {
                    if (isLocked()) {
                        lock();
                        sharedResource.setDatoCompartido(this.getName());
                        textArea.append(sharedResource.getDatoCompartido() + ": eats \n");

                        Thread.sleep((int) (inicio + Math.random() * fin));

                        if (isDead()) { kill(); }

                        unlock();
                    } else {
                        textArea.append("En espera...\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public Boolean isDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public void pause() {
        this.pause = false;
    }

    private void kill() {
        labelKilled.setText(getName() + " has been killed");
        stop();
    }

    public boolean isLocked() {

        switch (sharedResource.getAlgorithm()) {
            case CONDITIONS:
                return true;

            case INTERRUPTIONS:
                return sharedResource.isLockedInterruptions();

            case LOCK:
                return !lock.isLocked();

            case DEKKER:
                return true;

            case DIJKSTRA:
                return true;

            case MUTEX:
                return mutex.tryLock();

            case MUTEX_ART:
                return !mutex_art.getPase();

            default:
                return true;

        }

    }

    public void lock() {

        switch (sharedResource.getAlgorithm()) {
            case CONDITIONS:
                break;

            case INTERRUPTIONS:
                sharedResource.lockInterruptions();
                break;

            case LOCK:
                lock.lock();
                break;

            case DEKKER:

                break;

            case DIJKSTRA:
                break;

            case MUTEX:
                mutex.lock();
                break;

            case MUTEX_ART:
                mutex_art.lock();
                break;

            default:

        }

    }

    public void unlock() {

        switch (sharedResource.getAlgorithm()) {
            case CONDITIONS:
                break;

            case INTERRUPTIONS:
                sharedResource.unlockInterruptions();
                break;

            case LOCK:
                lock.unlock();
                break;

            case DEKKER:
                break;

            case DIJKSTRA:
                break;

            case MUTEX:
                mutex.unlock();
                break;

            case MUTEX_ART:
                mutex_art.unlock();
                break;

            default:

        }

    }

}
