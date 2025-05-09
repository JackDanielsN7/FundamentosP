/*Obtener el IGV (18%) de una venta si esta es superior a S/ 150,000.00 aplicar un descuento del 25 %.
*/
import java.util.Scanner;
public class carpeta25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de venta: ");
        double valorVenta = scanner.nextDouble();
        double igv = valorVenta * 0.18;
        double descuento = 0.0;

        if (valorVenta > 150000) {
            descuento = valorVenta * 0.25;
        }

        double totalPagar = valorVenta + igv - descuento;

        // Mostrar los resultados
        System.out.printf("IGV: %.1f\n", igv);
        System.out.printf("Descuento: %.1f\n", descuento);
        System.out.printf("Total: %.1f\n", totalPagar);

        scanner.close();
    }
}
