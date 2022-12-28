package intro_prog.ejercicio8;

public class PersonaMain {

public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(20);
    persona.setNombre("Junior");
    persona.setTelefono("99999999");

    System.out.println("El nombre es: "+persona.getNombre());
    System.out.println("La edad es: "+persona.getEdad());
    System.out.println("El telefono es: "+persona.getTelefono());
}
    
}
