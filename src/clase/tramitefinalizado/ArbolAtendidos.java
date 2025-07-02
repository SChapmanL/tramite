/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.tramitefinalizado;

/**
 *
 * @author ariel
 */
public class ArbolAtendidos {
    NodoA raizA;

    public ArbolAtendidos() {
    }
    public void insertarObj(NodoA obj){
       raizA = agregarRecursivo(raizA, obj);
    }
    
    public NodoA agregarRecursivo(NodoA raiz, NodoA obj){
        if(raiz==null){
            raiz = obj;
        }
        else{
            if (obj.getTram().getExp().getId() <raiz.getTram().getExp().getId()){
                raiz.izq=agregarRecursivo(raiz.izq,obj);
            }
            else{
                raiz.der=agregarRecursivo(raiz.der,obj);
            }
        }
        return raiz;
    }
    
    public boolean BuscarPorDni(NodoA r, int dni){
        if (r == null){
            return false;
        }
        if (r.getTram().getExp().getInter().getDNI() == dni) {
            return true;
        }
        else{
                return BuscarPorDni(r.der,dni)|| BuscarPorDni(r.izq,dni);
        }
    }
    
    
    
    public int Contar(NodoA r){
        if (r ==null) {
            return 0;
        }
        else{
            return 1+ Contar(r.izq) + Contar(r.der);
        }
    }

    public NodoA getRaizA() {
        return raizA;
    }

    public void setRaizA(NodoA raizA) {
        this.raizA = raizA;
    }
    
}
