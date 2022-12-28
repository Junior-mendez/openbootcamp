package intro_prog.ejercicio9;

public class Cliente extends Persona {

    private Double credito;

    public Cliente(Double credito) {
        super();
        this.credito = credito;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente [edad=" + super.getEdad().toString() + ", nombre=" + super.getNombre() + ", telefono=" + super.getTelefono() + ", credito=" + credito + "]";
    }
    
    
    
    
}
