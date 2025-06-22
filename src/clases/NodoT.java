/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ariel
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class NodoT {
    String h_inicio , h_final,dependencias;
    boolean docs;
    boolean atendido;
    Expediente exp;
    NodoT sig;
    NodoT prev;

    public NodoT(String dependencias, boolean docs, Expediente exp,boolean atendido) {
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
