/*Calcular el total que una persona debe pagar en una llantera, si el precio de cada llanta es
de S/ 800 si se compran menos de 5 llantas y de S/ 700 si se compran 5 o más.
-Ingrese la cantidad de llantas 1 : 5
-Ingrese la cantidad de llantas 2 : 54 
*/

import java.util.Scanner;
public class carpeta29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de llantas: ");
        int cantidad = scanner.nextInt();
        int precioUnitario = (cantidad >= 5) ? 700 : 800;
        int total = cantidad * precioUnitario;
        System.out.printf("cantidad"+cantidad);
        System.out.printf("precioUnitario"+precioUnitario);
        System.out.printf("total :"+total);
        
        scanner.close();
    }
}
