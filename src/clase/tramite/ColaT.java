/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.tramite;

import clase.expediente.Expediente;
import clase.expediente.NodoExp;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ariel
 */
public class ColaT {
    NodoT frente;
    NodoT ultimo;
    int cuenta;

    public ColaT() {
        this.cuenta = 0;
        
    }
    //ENCOLAR
    public void IngresarTramite(tramite tram){
        NodoT temp =new NodoT(tram);
        if(frente== null)frente=ultimo=temp;
        else{
            temp.sig = ultimo;
            ultimo.prev = temp;
        }
        ultimo = temp;
        cuenta++;
    }
    
    //DECOLAR
    public tramite RegistrarFinalizacionTramite(){
        tramite aux = null;
        if(estaVacio() == true){
            JOptionPane.showMessageDialog(null, "Esta vacia la cola de tramites");
        }
        else{
            aux = frente.getTram();
            frente = frente.prev;
            cuenta = cuenta -1;
        }
        return aux;
    }
    //VACIO
    public boolean estaVacio(){
        if(frente == null)return true;
        else return false;
    }       
            
    public void RegistrarMovDependecias(int idexp, String nuevaDep){
        NodoT aux =frente;
        tramite tram = BuscarTramite(idexp);
        
        if (tram !=null) {
            tram.setDependencias(nuevaDep);
            JOptionPane.showMessageDialog(null, "Se registro exitosamente el cambio de dependencia");
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontro el expediente");
        }
    }
    
    public tramite iesimo(int pos) {
        tramite elemento = null; // -1 significa que el elemento no existe
        // Validar la posicion 
        if (pos >= 1 && pos <= cuenta) {
            int i = 1;
            NodoT aux = frente;
            while (i < pos) {
                i++;
                aux = aux.prev;
            }
            elemento = aux.getTram();
            return elemento;
        }
        return elemento;
    }
    public tramite BuscarTramite(int id){
        NodoT aux = frente;
        boolean encontrado = false;
        while (aux != null) {
            if(aux.getTram().getExp().getId() ==id){
                encontrado = true;
                break;
            }
            aux =aux.prev;
        }
        if(encontrado ==true){
            return aux.getTram();
        }
        else{
         return null;   
        }
    }
    
    public NodoT getFrente() {
        return frente;
    }

    public void setFrente(NodoT frente) {
        this.frente = frente;
    }

    public NodoT getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoT ultimo) {
        this.ultimo = ultimo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    
    
    
}
