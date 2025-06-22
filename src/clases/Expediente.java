/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ariel
 */
public class Expediente {
    private int id;
    private int prioridad;
    private String asunto;
    private boolean documento;
    interesados inter;

    public Expediente(int id, int prioridad, String asunto, boolean documento, interesados inter) {
        this.id = id;
        this.prioridad = prioridad;
        this.asunto = asunto;
        this.documento = documento;
        this.inter = inter;
    }

    public int getId() {
        return id;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public boolean isDocumento() {
        return documento;
    }
    
}
