package model.Expediente;

public class Interesado {
    protected int dni;
    protected int telefono;
    protected String nombre;
    protected String email;
    protected String tipo;

    public Interesado(int dni, int telefono, String nombre, String email, String tipo) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.tipo = tipo;
    }

    public Interesado() {
        
    }
    
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
