/* Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
*/
public class carpeta6 {
    public static void main(String[] args) {

        System.out.println(mostrarFactorial(0));
        System.out.println(mostrarFactorial(7));
        System.out.println(mostrarFactorial(10));
        System.out.println(mostrarFactorial(1));
        System.out.println(mostrarFactorial(-1));
    }

    public static String mostrarFactorial(int numero) {
        int resultado = factorial(numero);
        if (resultado != -1) {
            return String.valueOf(resultado);
        } else {
            return "No tiene factorial";
        }
    }

    private static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
