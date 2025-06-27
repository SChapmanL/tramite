package clase.tramite;

import clase.expediente.Expediente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tramite {
    String h_inicio , h_final,dependencias;
    boolean docs;
    String estado;
    Expediente exp;

    public tramite() {
    }

    
    public tramite(String dependencias, boolean docs, Expediente exp,String estado) {
        this.dependencias = dependencias;
        this.docs = docs;
        this.exp = exp;
        this.estado = estado;
        InicioTramite();
    }
    
    public void InicioTramite() {
        // Obtener fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Formateador personalizado (puedes cambiar el formato si deseas)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Coloar la Hora de inicio del tramite
        h_inicio= fechaHoraActual.format(formato);
    }
    
    public void FinalTramite(){
        // Obtener fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Formateador personalizado (puedes cambiar el formato si deseas)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Coloar la Hora de inicio del tramite
        h_final= fechaHoraActual.format(formato);
    }

    public String getH_inicio() {
        return h_inicio;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }

    public boolean isDocs() {
        return docs;
    }

    public void setDocs(boolean docs) {
        this.docs = docs;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }
    
}
