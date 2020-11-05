package cpp2;

import static cpp2.Algorithms.*;
import java.util.ArrayList;

public class SharedResource extends Thread{
    
    private static final int INTERRUPTIONS_AMOUNT = 10;
    public static final int N = 4;
    
    private String datoCompartido;
    private int algorithm;
    
    private ArrayList<Interruption> interruptions;
    private Cerradura lock;
    
    private boolean b[], c[];
    private int k;
    
    private boolean bdek[];
    private int turno;
    
    public SharedResource() {
        datoCompartido = "";
        algorithm = CONDITIONS;
        
        interruptions = new ArrayList();
        initInterruptions();
        
        this.lock = new Cerradura();
        
        b = new boolean[N];
        c = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            b[i] = true;
            c[i] = true; 
        }
        
        k = 0;
        
        bdek = new boolean[4];
        bdek[0] = true;
        bdek[1] = false;
        bdek[2] = false;
        bdek[3] = false;
        
        turno = 0;
    }
    
    public void reset() {
        datoCompartido = "";
        
        interruptions = new ArrayList();
        initInterruptions();
        
        this.lock = new Cerradura();
        
        b = new boolean[N];
        c = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            b[i] = true;
            c[i] = true; 
        }
        
        k = 0;
        
        bdek = new boolean[4];
        bdek[0] = true;
        bdek[1] = false;
        bdek[2] = false;
        bdek[3] = false;
        
    }

    public int nextTurno() {
        if (turno == 3) turno = 0;
        else turno++;
        return turno;
    }
    
    public boolean[] getBdek() {
        return bdek;
    }

    public void setBdek(boolean[] bdek) {
        this.bdek = bdek;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public boolean[] getB() {
        return b;
    }

    public void setB(boolean[] b) {
        this.b = b;
    }

    public boolean[] getC() {
        return c;
    }

    public void setC(boolean[] c) {
        this.c = c;
    }
    
    public String getDatoCompartido() {        
        return datoCompartido;        
    }

    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
    
    private void initInterruptions() {
        for (int i = 0; i < INTERRUPTIONS_AMOUNT; i++) {
            interruptions.add(new Interruption());
        }
    }
    
    public int getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }
    
    public void lockInterruptions() {
        for (Interruption interruption : interruptions) {
            interruption.setInterrption(false);
        }
    }
    
    public void unlockInterruptions() {
        for (Interruption interruption : interruptions) {
            interruption.setInterrption(true);
        }
    }
    
    public boolean isLockedInterruptions() {
        
        for (Interruption interruption : interruptions) {
            if (!interruption.isInterrption()) {
                return false;
            }
        }
        
        return true;
    }
    
}
