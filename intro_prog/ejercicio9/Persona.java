package intro_prog.ejercicio9;

public class Persona {
    private Integer edad;
    private String nombre;
    private String telefono;
    

    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    

    
}
