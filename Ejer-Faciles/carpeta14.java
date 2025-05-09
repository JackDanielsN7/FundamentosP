/* Crea una función que ordene y retorne una matriz de números.
-La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro  adicional "Asc" o "Desc"
para indicar si debe ordenarse de menor a mayor o de mayor a menor.
[1, 2, 4, 6, 8]
[8, 6, 4, 2, 1]
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class carpeta14 {

    public static List<Integer> sort(List<Integer> lista, boolean ascendente) {//lo hace más directo para pruebas y lógica
        if (ascendente) {
            Collections.sort(lista);//estándar para ordenar listas en Java.
        } else {
            Collections.sort(lista, Collections.reverseOrder());
        }
        return lista;
    }

    public static void main(String[] args) {
        System.out.println(sort(new ArrayList<>(List.of(4, 6, 1, 8, 2)), true)); //para crear una lista modificable. 
        System.out.println(sort(new ArrayList<>(List.of(4, 6, 1, 8, 2)), false));
    }
}
