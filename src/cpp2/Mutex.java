package cpp2;

public class Mutex {

    private boolean pase;

    public Mutex() {
        this.pase = false;
    }

    synchronized public void lock() {
        while (pase) {
            try { wait(); } catch (Exception e) { }
        }

        this.pase = true;
    }

    public void unlock() {
        this.pase = false;
        try { notify(); } catch (Exception e) { }
    }

    synchronized public boolean getPase() {
        return this.pase;
    }

    synchronized public void setPase(Boolean pase) {
        this.pase = pase;
    }

}
