/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.expediente;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ColaPrioridadExp {
    NodoExp ultimo;
    NodoExp frente;
    int cuenta;
    int contador;
    
    public ColaPrioridadExp(){
        cuenta =0;
    }
    
    public void EncolarPrioridad(Expediente exp){
        NodoExp temp = new NodoExp(exp);
        if(frente== null)frente=ultimo=temp;
        else{
            //1er caso
            if(temp.getExp().getPrioridad() >= ultimo.getExp().getPrioridad()){
                temp.sig =ultimo;
                ultimo.prev =temp;
                ultimo =temp;
            }
            else if (temp.getExp().getPrioridad() < frente.getExp().getPrioridad()) {
                temp.prev = frente;
                frente.sig =temp;
                frente = temp;
            }
            //2do caso
            
            // 3er caso
            else{
                NodoExp aux = frente;
                while (aux.getExp().getPrioridad() <= temp.getExp().getPrioridad()) {                    
                    aux = aux.prev;
                }
                temp.prev =aux;
                temp.sig = aux.sig;
                aux.sig.prev =temp;
                aux.sig = temp;
            }
        }
        cuenta++;
        contador++;
    }
    
    public boolean BuscarPorDni(int dni){
        NodoExp aux = frente;
        while(aux != null){
            if(aux.getExp().getInter().getDNI() == dni){
                return true;
            }
            aux =aux.prev;
        }
        return false;
    }
    
    public void Encolar(Expediente exp){
        NodoExp temp = new NodoExp(exp);
        if(frente== null)frente=ultimo=temp;
        else{
            temp.sig = ultimo;
            ultimo.prev = temp;
        }
        ultimo = temp;
        cuenta++;
        contador++;
    }
   
    
    public boolean estaVacio(){
        if(frente == null)return true;
        else return false;
    }
    
    public Expediente Decolar(){
        Expediente n = new Expediente();
        if(estaVacio() == true){
            JOptionPane.showMessageDialog(null, "No hay expedientes");
        }
        else{
            n =  frente.exp;
            frente = frente.prev;
            cuenta = cuenta -1;
        }
        return n;
    }
    
    public Expediente iesimo(int pos) {
        Expediente elemento = null; // -1 significa que el elemento no existe
        // Validar la posicion 
        if (pos >= 1 && pos <= cuenta) {
            int i = 1;
            NodoExp aux = frente;
            while (i < pos) {
                i++;
                aux = aux.prev;
            }
            elemento = aux.getExp();
            return elemento;
        }
        return elemento;
    }

    public NodoExp getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoExp ultimo) {
        this.ultimo = ultimo;
    }

    public NodoExp getFrente() {
        return frente;
    }

    public void setFrente(NodoExp frente) {
        this.frente = frente;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}
