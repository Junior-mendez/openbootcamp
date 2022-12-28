package intro_prog;

/**
 * ejercicio4
 */
public class ejercicio4 {
    public static void main(String[] args) {
        verifyNumber(-10);
        cicloWhile(2);
        cicloDoWhile(0);
        cicloFor();
        casoSwitch("verano");
    }
    

    public static void verifyNumber(Integer numeroif){
        if(numeroif<0){
            System.out.println("El número es negativo");
        }
        else if (numeroif==0) {
            System.out.println("El número es Cero");
        }
        else{
            System.out.println("El número es positivo");
        }
    }

    public static void cicloWhile(Integer numeroWhile){
        while (numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile+=1;
        }
    }

    public static void cicloDoWhile(Integer numeroDoWhile){
        do {
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile !=numeroDoWhile);
    }

    public static void cicloFor() {
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void casoSwitch(String estacion) {

        switch (estacion) {
            case "verano":
                System.out.println("Está en verano");
                break;
            case "invierno":
                System.out.println("Está en invierno");
                break;
            case "otoño":
                System.out.println("Está en otoño");
                break;
            case "primavera":
                System.out.println("Está en primavera");
                break;
            
            default:
                System.out.println("No es una estación");
                break;
        }
    }


}