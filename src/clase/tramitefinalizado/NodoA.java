/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.tramitefinalizado;

import clase.tramite.tramite;


public class NodoA {
    tramite tram;
    NodoA der;
    NodoA izq;

    public NodoA(tramite tram) {
        this.tram = tram;
    }

    public tramite getTram() {
        return tram;
    }

    public void setTram(tramite tram) {
        this.tram = tram;
    }

    public NodoA getDer() {
        return der;
    }

    public void setDer(NodoA der) {
        this.der = der;
    }

    public NodoA getIzq() {
        return izq;
    }

    public void setIzq(NodoA izq) {
        this.izq = izq;
    }
    
    
}
