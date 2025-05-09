/* Crea un programa se encargue de transformar un número  decimal a binario
sin utilizar funciones propias del lenguaje que lo hagan directamente.
decimal = 29;
*/
public class carpeta4 {
    public static String convertirABinario(int decimal) {
        String binario = "";

        while (decimal > 0) {
            int residuo = decimal % 2;
            binario = residuo + binario; 
            decimal = decimal / 2;     
        }

        return binario;
    }
    public static void main(String[] args) {
        int numeroDecimal = 29;
        String resultadoBinario = convertirABinario(numeroDecimal);

        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Binario: " + resultadoBinario);
    }
}
