
package clases;

/**
 *
 * @author ariel
 */
public class NodoT {
    tramite Tramite;
    NodoT sig;
    NodoT prev;

    public NodoT(tramite Tramite) {
        this.Tramite = Tramite;
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

}
