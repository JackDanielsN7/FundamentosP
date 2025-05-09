/* Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
La función recibirá el mes y el año y retornará verdadero o falso.
*/
import java.time.DayOfWeek;
import java.time.LocalDate;

public class carpeta21 {
    
    public static boolean vierenes13(int año, int mes) {
        // Validamos que el año y el mes sean válidos
        if (año < 1 || mes < 1 || mes > 12) {
            return false;
        }

        // Crea una fecha del 13 de ese mes y año
        LocalDate date = LocalDate.of(año, mes, 13);

        // Verifica si el día de la semana es VIERNES
        return date.getDayOfWeek() == DayOfWeek.FRIDAY;
    }

    public static void main(String[] args) {
        System.out.println(vierenes13(2023, 3));   // verdad
        System.out.println(vierenes13(2023, 1));   // falso
        System.out.println(vierenes13( -2023, 1));     // falso
    }

}
