/*Dado un número natural de dos cifras, diseñe un algoritmo que permita
obtener el número invertido. Ejemplo si se ingresa 23 que se muestre 32.
Ingresa un número natural de dos cifras:  45
*/
import java.util.Scanner;
public class carpeta26 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número natural de dos cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 99) {
            int decena = numero / 10;
            int unidad = numero % 10;
            int numeroInvertido = unidad * 10 + decena;
            System.out.println(numero + " --> " + numeroInvertido);
        } else {
            System.out.println("Por favor, ingresa un número natural de dos cifras.");
        }

        scanner.close();
    }
}
