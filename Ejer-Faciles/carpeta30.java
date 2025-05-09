/*Ingresar dos números entero y luego determinar y mostrar:
 a. Si el primero es divisible por el segundo
b. Si el segundo es divisible por el primero
c. Cuál de los dos es mayor; en caso que sean iguales, mostrar mensaje adecuado
d. Si ambos son impares
Ingresa los números
x = 10
y = 5
RPTA:
-X(10) es divisible entre Y(5)
-Y(5) no es divisible entre X(10)
-X(10) es el número mayor
-Ambos números no son impares
*/

import java.util.Scanner;
public class carpeta30 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los números");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        if (y != 0 && x % y == 0) {
            System.out.println("X(" + x + ") es divisible entre Y(" + y + ")");
        } else {
            System.out.println("X(" + x + ") no es divisible entre Y(" + y + ")");
        }
        
        if (x != 0 && y % x == 0) {
            System.out.println("Y(" + y + ") es divisible entre X(" + x + ")");
        } else {
            System.out.println("Y(" + y + ") no es divisible entre X(" + x + ")");
        }

        if (x > y) {
            System.out.println("X(" + x + ") es el número mayor");
        } else if (y > x) {
            System.out.println("Y(" + y + ") es el número mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }

        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Ambos números son impares");
        } else {
            System.out.println("Ambos números no son impares");
        }

        scanner.close();
    }
}
