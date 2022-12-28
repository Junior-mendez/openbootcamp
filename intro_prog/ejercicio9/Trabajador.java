package intro_prog.ejercicio9;

public class Trabajador extends Persona{
    private Double salario;

    public Trabajador(Double salario) {
        super();
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador [edad=" + super.getEdad().toString() + ", nombre=" + super.getNombre() + ", telefono=" + super.getTelefono() + ", salario=" + salario + "]";
    }
    
    
    
    
}
