/* Dada una URL con parámetros, crea una función que obtenga sus valores.
los parámetros serían ["2023", "0"]
*/
import java.util.ArrayList;
import java.util.List;

public class carpeta20 {
     public static List<String> obtenerParametros(String url) {
        List<String> parametros = new ArrayList<>();
        int inicio = url.indexOf('?');
        
        if (inicio != -1) {
            String query = url.substring(inicio + 1);
            String[] pares = query.split("&");
            
            for (String par : pares) {
                String[] claveValor = par.split("=");
                if (claveValor.length > 1) {
                    parametros.add(claveValor[1]);
                }
            }
        }
        
        return parametros;
    }

    public static void main(String[] args) {
        String url = "";
        List<String> parametros = obtenerParametros(url);
        System.out.println(parametros); // [2024, 0, java]
    }
}
