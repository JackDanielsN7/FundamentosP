/* Crea una función que reciba un String de cualquier tipo y se encargue de poner en mayúscula la primera letra de cada palabra.
 - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 */
public class carpeta8 {
    public static void main(String[] args) {
        System.out.println(capitalLetter("concurso de programacion"));
    }
    public static String capitalLetter(String texto) {
        String resultado = "";
        boolean nuevaPalabra = true;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == ' ') {
                resultado += c;
                nuevaPalabra = true; 
            } else {
                if (nuevaPalabra) {
                    
                    if (c >= 'a' && c <= 'z') {
                        c = (char)(c - 32);
                    }
                    nuevaPalabra = false;
                }
                resultado += c;
            }
        }
        return resultado;
    }
}
