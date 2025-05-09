
/*Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas
hay en el curso actual. Diseñar un algoritmo para este propósito
(recuerda que para calcular el porcentaje puedes hacer una regla de 3).
Ingresa la cantidad de niños : 20
Ingrese la cantidad de niñas: 30
*/
import java.util.Scanner;

public class carpeta24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de niños: ");
        int niños = scanner.nextInt();
        System.out.print("Ingresa la cantidad de niñas: ");
        int niñas = scanner.nextInt();
        int totalEstudiantes = niños + niñas;

        if (totalEstudiantes > 0) {
            // Calcular los porcentajes
            double porcentajeNiños = (double) niños / totalEstudiantes * 100;
            double porcentajeNiñas = (double) niñas / totalEstudiantes * 100;

            
            System.out.println("Porcentaje niños: "+ porcentajeNiños);
            System.out.println("Porcentaje niñas: "+porcentajeNiñas);
        } else {
            System.out.println("El número total de estudiantes debe ser mayor que cero.");
        }

        scanner.close();
    }

}
