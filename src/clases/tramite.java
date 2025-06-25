package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tramite {
    String h_inicio , h_final,dependencias;
    boolean docs;
    boolean atendido;
    Expediente exp;

    public tramite(String dependencias, boolean docs, boolean atendido, Expediente exp) {
        this.dependencias = dependencias;
        this.docs = docs;
        this.atendido = atendido;
        this.exp = exp;
        
    }
    
    public tramite(String dependencias, boolean docs, Expediente exp,boolean atendido) {
        this.dependencias = dependencias;
        this.docs = docs;
        this.exp = exp;
        this.atendido = atendido;
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
}
