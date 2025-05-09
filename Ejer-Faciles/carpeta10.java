/*Crea una función que reciba dos array, un booleano y retorne un array.
- Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
- Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
[2, 3, 4]
[1, 6]
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class carpeta10 {
     public static List<Integer> calculateSet(List<Integer> list1, List<Integer> list2, boolean comunes) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        
        if (comunes) {
            set1.retainAll(set2); // Conserva solo los elementos comunes
            return new ArrayList<>(set1);
        } else {
            Set<Integer> result = new HashSet<>(set1);
            result.addAll(set2);      // Unión de ambos
            Set<Integer> intersection = new HashSet<>(set1);
            intersection.retainAll(set2); // Elementos comunes
            result.removeAll(intersection); // Quita los comunes
            return new ArrayList<>(result);
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateSet(
            List.of(1, 2, 3, 3, 4),
            List.of(2, 2, 3, 3, 3, 4, 6),
            true)); // [2, 3, 4]

        System.out.println(calculateSet(
            List.of(1, 2, 3, 3, 4),
            List.of(2, 2, 3, 3, 3, 4, 6),
            false)); // [1, 6]
    }
}
