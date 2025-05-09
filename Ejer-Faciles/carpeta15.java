/* Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado.

 - Utiliza el menor número de líneas para resolver el ejercicio.
 año de inicio  =  1999 
 */

import java.util.GregorianCalendar;

public class carpeta15 {
    public static void main(String[] args) {
        int añoInicio= 1999;
        int añoBisiesto=0;
        while (añoBisiesto < 30) {
            añoInicio++;
            if (new GregorianCalendar().isLeapYear(añoInicio)) {
                System.out.println(añoInicio+"");
                añoBisiesto++;
            }
        }
    }
}
