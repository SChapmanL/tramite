package clases;
import java.util.Arrays;
/**
 *
 * @author Sebastián
 */
public class arraylist {
    // PUEDE SERVIR PARA EL HEAP
    public int capacidad = 10; //solo es inicial
    public Object[] elementos;
    public int nroElementos;

    public arraylist(Object[] elementos, int nroElementos) {
        this.elementos = new Object[capacidad];
        this.nroElementos = nroElementos;
    }
    
    // método añadir
    public void add(NodoExp nodoexp) {
        if (nroElementos == elementos.length) {
            capacidad = capacidad*2;
            elementos = Arrays.copyOf(elementos, capacidad);
        }
        // asi se añaden objetos
        elementos[nroElementos++] = nodoexp;
    }
    
    // obtener por posicion
    public NodoExp get(int pos) {
        if (pos < 0 || pos >= nroElementos) {
            return null;
        }
        NodoExp elemento = (NodoExp) elementos[pos]; // casteo a tipo genérico
        return elemento; 
    }
    
    public NodoExp remove(int pos) {
        if (pos < 0 || pos >= nroElementos) {
            return null;
        }
        NodoExp elementoBorrado = (NodoExp) elementos[pos];
        for (int i = pos; i < nroElementos - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[nroElementos - 1] = null;
        nroElementos--;
        return elementoBorrado;
    }
    
    // reemplazo
    public NodoExp set(NodoExp nodoexp , int pos) {
        if (pos < 0 || pos >= nroElementos) {
            return null;
        }
        NodoExp elementoAntiguo = (NodoExp) elementos[pos];
        elementos[pos] = nodoexp;
        return elementoAntiguo;
    }
    
    
}
