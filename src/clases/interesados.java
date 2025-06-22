/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ariel
 */
public abstract class interesados {
    protected int dni, telefeno;
    protected String telefono,email;

    public interesados(int dni, int telefeno, String telefono, String email) {
        this.dni = dni;
        this.telefeno = telefeno;
        this.telefono = telefono;
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(int telefeno) {
        this.telefeno = telefeno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
