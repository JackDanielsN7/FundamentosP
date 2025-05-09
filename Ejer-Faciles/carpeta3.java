 /* Crea un programa que invierta el orden de una cadena de texto sin usar
 funciones propias del lenguaje que lo hagan de forma automática.
 - Si le pasamos "Hola mundo" nos retornaría "odnum aloH".
 */
public class carpeta3 {
     public static String invertir(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i); 
        }
        return resultado;
    }
    public static void main(String[] args) {
        String original = "Hola mundo";
        String invertida = invertir(original);
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
