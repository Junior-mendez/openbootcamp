package intro_prog.ejercicio9;

public class Ejercicio9Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(30.0);
        cliente.setEdad(20);
        cliente.setNombre("Junior");
        cliente.setTelefono("9999999");

        Trabajador trabajador = new Trabajador(30.0);
        trabajador.setEdad(20);
        trabajador.setNombre("Junior");
        trabajador.setTelefono("9999999");
     
        System.out.println(cliente.toString());
        System.out.println(trabajador.toString());
    }
    
}
