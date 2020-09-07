package cpp2;

public class SharedResource {
    
    private String datoCompartido;

    public SharedResource() {
        this.datoCompartido = "";
    }
    

    public String getDatoCompartido() {
        return datoCompartido;
    }

    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
    
}
