/*Ingresar 4 notas de un alumno y mostrar la mejor nota.
Validación:  
nota 1: 18
nota 2: 13
nota 3: 10
nota 4:15
RPTA: La nota mayor es 18
*/
import java.util.Scanner;

public class carpeta27 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingresa la nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingresa la nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Ingresa la nota 4: ");
        double nota4 = scanner.nextDouble();

        double mejorNota = Math.max(Math.max(nota1, nota2), Math.max(nota3, nota4));
        System.out.println("La mejor nota es: " + mejorNota);

        scanner.close();
    }
}
