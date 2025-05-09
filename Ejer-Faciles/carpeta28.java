/*Determinar si un alumno aprueba o reprueba un curso sabiendo que aprobara si su
promedio de tres calificaciones es mayor o igual a 17; reprueba en caso contrario.
primera nota: 18
segunda nota: 17
tercera nota:19
*/
import java.util.Scanner;
public class carpeta28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingresa la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingresa la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 17) {
            System.out.printf("Aprobado con  "+promedio);
        } else {
            System.out.printf("Reprobado con "+promedio);
        }

        scanner.close();
    }
}
