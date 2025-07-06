/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.dependencias;

/**
 *
 * @author ariel
 */
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
    
    public void push(String Dependencia) {
        NodoDep nuevo = new NodoDep(Dependencia);
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
    
    public void pushCurrAnt(String DependenciaN, String DependenciaAnt) {
        NodoDep nuevo = new NodoDep(DependenciaN, DependenciaAnt);
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
        } else {
            String depe = ultimo.dependenciaActual;
            ultimo.prev.sig = null;
            ultimo = ultimo.prev;
            cuenta--;
            return depe;
        }
    }
    
    public String peek() {
        if (isEmpty()) {
            return "Empty";
        } else {
            return ultimo.dependenciaActual;
        }
    }
    
    public void imprimir() {
        NodoDep actual = base;
        while(actual !=null) {
            System.out.print(actual.dependenciaActual + " / " + actual.dependenciaAnterior + "-->");
            actual = actual.sig;
        }
        System.out.print("null\n");
    }

    public NodoDep getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDep ultimo) {
        this.ultimo = ultimo;
    }

    public NodoDep getBase() {
        return base;
    }

    public void setBase(NodoDep base) {
        this.base = base;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    public NodoDep isesimo(int pos) {
            if (pos >= cuenta || pos < 0) {
                return null;
            }
            
            NodoDep actual = base;
            while(actual != null) {
                actual = actual.sig;
                return actual;
            }
            return actual;
    }
    
    
}
