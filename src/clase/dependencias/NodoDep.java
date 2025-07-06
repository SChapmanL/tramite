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
    String dependenciaAnterior;

    public NodoDep(String dependenciaActual) {
        this.dependenciaActual = dependenciaActual;
        this.prev = null;
        this.sig = null;
        this.dependenciaAnterior = null;
    }

    public NodoDep(String dependenciaActual, String dependenciaAnterior) {
        this.dependenciaActual = dependenciaActual;
        this.dependenciaAnterior = dependenciaAnterior;
        this.prev = null;
        this.sig = null;
    }

    public NodoDep getSig() {
        return sig;
    }

    public void setSig(NodoDep sig) {
        this.sig = sig;
    }

    public String getDependenciaActual() {
        return dependenciaActual;
    }

    public void setDependenciaActual(String dependenciaActual) {
        this.dependenciaActual = dependenciaActual;
    }

    public String getDependenciaAnterior() {
        return dependenciaAnterior;
    }

    public void setDependenciaAnterior(String dependenciaAnterior) {
        this.dependenciaAnterior = dependenciaAnterior;
    }
    
    
    
    
}
