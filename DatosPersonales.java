import java.util.Scanner;
public class DatosPersonales {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Escribe tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escribe tu ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años " + "y vives en " + ciudad);
        
    }
}