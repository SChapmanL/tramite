/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.expediente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ariel
 */
public class Expediente {
    private int id;
    private int prioridad;
    private String asunto;
    private boolean documento;
    private String fechaingreso;
    interesados inter;

    public Expediente(int id, int prioridad, String asunto, boolean documento, interesados inter) {
        this.id = id;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.documento = documento;
        this.inter = inter;
        EntradaExpediente();
    }
    public void EntradaExpediente() {
        // Obtener fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Formateador personalizado (puedes cambiar el formato si deseas)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Coloar la Hora de inicio del tramite
        fechaingreso= fechaHoraActual.format(formato);
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

    public interesados getInter() {
        return inter;
    }

    public void setInter(interesados inter) {
        this.inter = inter;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    
    
}
