/*Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.
*/
import java.util.Scanner;
public class carpeta23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicar = num1 * num2;

        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println(num1 + " + " + num2 + " = " + suma);
            System.out.println(num1 + " - " + num2 + " = " + resta);
            System.out.println(num1 + " x " + num2 + " = " + multiplicar);
            System.out.println((double)num1 + " / " + (double)num2 + " = " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        scanner.close();
    }
}
