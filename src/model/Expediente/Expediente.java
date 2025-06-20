package model.Expediente;

public class Expediente {
    private int id;
    private int prioridad;
    private String asunto;
    private boolean documento;
    private Interesado interesados;

    public Expediente(int id, int prioridad, String asunto, boolean documento, Interesado interesados) {
        this.id = id;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.documento = documento;
        this.interesados = interesados;
    }

    public Expediente() {
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public boolean isDocumento() {
        return documento;
    }

    public void setDocumento(boolean documento) {
        this.documento = documento;
    }

    public Interesado getInteresados() {
        return interesados;
    }

    public void setInteresados(Interesado interesados) {
        this.interesados = interesados;
    }
}
