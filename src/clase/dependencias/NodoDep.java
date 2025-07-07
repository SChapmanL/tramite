/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.dependencias;

/**
 *
 * @author ariel
 */
public class NodoDep {
    NodoDep prev;
    NodoDep sig;
    String dependenciaActual;
    String fechaCambio;

    public NodoDep(String dependenciaActual, String fechaCambio) {
        this.dependenciaActual = dependenciaActual;
        this.fechaCambio = fechaCambio;
        this.prev = null;
        this.sig = null;
    }

    public String getDependenciaActual() {
        return dependenciaActual;
    }

    public void setDependenciaActual(String dependenciaActual) {
        this.dependenciaActual = dependenciaActual;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }
    
    
}
