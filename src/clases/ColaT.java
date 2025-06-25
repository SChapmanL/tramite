/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

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
    //ENCOLAR SEGUN ORDEN DE PRIORIDAD
    public void IngresarTramite(NodoT temp){
        
    }
    
    //DECOLAR
    public NodoT RegistrarFinalizacionTramite(){
        NodoT aux = frente;
        if(estaVacio() == true){
            JOptionPane.showMessageDialog(null, "Esta vacia la cola de tramites");
        }
        else{
            frente = frente.prev;
            cuenta = cuenta -1;
        }
        
        return aux;
    }
    
    public boolean estaVacio(){
        if(frente == null)return true;
        else return false;
    }       
            
    public void RegistrarMovDependecias(){
        
    }
    
    public void MostarTramitesNoAtendidos(){
        
    }
    
    
    
}
