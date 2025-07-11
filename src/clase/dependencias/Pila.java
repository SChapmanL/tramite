/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.dependencias;


public class Pila {
    NodoDep ultimo;
    NodoDep base;
    int cuenta;

    public Pila() {
        this.ultimo = null;
        this.base = null;
    }
    
    public boolean isEmpty() {
        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(String Dependencia, String fcambio) {
        NodoDep nuevo = new NodoDep(Dependencia, fcambio);
        if (isEmpty() == true) {
            base = ultimo = nuevo;
        } else {
            // tiene mas de un elemento
            ultimo.sig = nuevo;
            nuevo.prev = ultimo;
        }
        ultimo = nuevo;
        cuenta++;
    }
    
    public String pop() {
        if (isEmpty()) {
            return "Empty";
        }
        String depe = ultimo.getDependenciaActual();
        if (ultimo.prev == null) {
            ultimo = null;
            base = null;
        } else {
            ultimo = ultimo.prev;
            ultimo.sig = null;
        }
        cuenta--;
        return depe;
    }
    
    public String peek() {
        if (isEmpty()) {
            return "Empty";
        } else {
            return ultimo.dependenciaActual;
        }
    }
    
    
    public NodoDep isesimo(int pos) {
        if (pos >= contar() || pos < 0) {
            return null;
        }
            
        NodoDep actual = base;
        for (int i = 0; i < pos; i++) {
            if (actual != null) {
                actual = actual.sig;
            }
        }
        return actual;
    }
    
    public int contar() {
        int contador = 0;
        NodoDep actual = base;

        while(actual != null) {
            contador++;
            actual = actual.sig;
        }

        return contador;
    }
    
    
    
}
