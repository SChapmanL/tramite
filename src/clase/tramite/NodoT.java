
package clase.tramite;

import clase.tramite.tramite;

/**
 *
 * @author ariel
 */
public class NodoT {
    tramite tram;
    NodoT sig;
    NodoT prev;

    public NodoT(tramite tram) {
        this.tram = tram;
        this.sig = null;
        this.prev = null;
    }

    // Getter and setters
    public NodoT getSig() {
        return sig;
    }

    public void setSig(NodoT sig) {
        this.sig = sig;
    }

    public NodoT getPrev() {
        return prev;
    }

    public void setPrev(NodoT prev) {
        this.prev = prev;
    }

    public tramite getTram() {
        return tram;
    }

    public void setTram(tramite tram) {
        this.tram = tram;
    }
    

}
