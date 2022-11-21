import java.util.Scanner;

public class danna {
   public danna (){

   }

    public static void main (String[] args) {

        System.out.println("Hola, porfavor diligenciar los siguientes datos!");
        Scanner entrada = new Scanner(System.in);
        System.out.println("su nombre");
        String cadena = entrada.nextLine();
        System.out.println("su apellido");
        String cadena1 = entrada.nextLine();
        System.out.println("su edad");
        int numero = entrada.nextInt();
        System.out.println("¿cuantas horas trabajas?");
        int numero1 = entrada.nextInt();
        System.out.println("cual es tu nombre es" + cadena + "su apellido es" + cadena1);
        System.out.println(" su edad es" + numero);
        System.out.println(" usted trabaja:" + numero1 +" horas");
        System.out.println(" su salario es de" +800000* numero1);

    }
}