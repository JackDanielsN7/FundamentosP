/* Crea un programa se encargue de transformar un número binario a decimal sin utilizar funciones propias del lenguaje que lo hagan directamente.
NUMERO  BINARIO 1: 00110
NUMERO BINARIO 2: 01100
*/
public class carpeta17 {
    public static void main(String[] args) {
         String binario1 = "00110";
         String binario2 = "01100";

         int decimal1= Integer.parseInt(binario1, 2);
         int decimal2= Integer.parseInt(binario2, 2);

         System.out.println("numeroBinario: "+binario1+"decimal: "+decimal1);
         System.out.println("numeroBinario: "+binario2+"decimal: "+decimal2);
    }
}
