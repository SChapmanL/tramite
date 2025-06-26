/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.expediente;

/**
 *
 * @author ariel
 */
public class NodoExp {
    Expediente exp;
    NodoExp sig;
    NodoExp prev;

    public NodoExp(Expediente exp) {
        this.exp = exp;
    }

    public NodoExp() {
    }

    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

    public NodoExp getSig() {
        return sig;
    }

    public void setSig(NodoExp sig) {
        this.sig = sig;
    }

    public NodoExp getPrev() {
        return prev;
    }

    public void setPrev(NodoExp prev) {
        this.prev = prev;
    }
    
    
}
