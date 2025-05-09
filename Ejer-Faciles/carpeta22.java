/* Crea una función que reciba un número decimal y lo trasforme a Octal y Hexadecimal.
valor a testear  =  100
100 en octal es 144
100 en hexadecimal es 64
*/
public class carpeta22 {
    public static void convertirDecimal(int numero) {
        
        if (numero < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            return;
        }

        String octal = Integer.toOctalString(numero);
        String hexadecimal = Integer.toHexString(numero).toUpperCase();
        System.out.println("Número decimal: " + numero);
        System.out.println("En octal: " + octal);
        System.out.println("En hexadecimal: " + hexadecimal);
    }

    public static void main(String[] args) {
        int numero =100;
        convertirDecimal(numero);
    }
}
