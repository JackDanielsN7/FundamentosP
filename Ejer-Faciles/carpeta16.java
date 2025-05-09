/* Dado un listado de números, encuentra el SEGUNDO más grande
validacion

 // Pruebas de la función "findSecondGreater"
 */
import java.util.*;
public class carpeta16{
     public static Integer findSecondGreater(List<Integer> numbers) {
        // Usamos TreeSet para ordenar y eliminar duplicados automáticamente
        TreeSet<Integer> sortedSet = new TreeSet<>(numbers);
        
        // Si hay menos de 2 elementos únicos, no hay segundo mayor
        if (sortedSet.size() < 2) {
            return null;
        }

        // Eliminamos el más grande
        sortedSet.pollLast();

        // El siguiente más grande ahora es el segundo
        return sortedSet.last();
    }

    public static void main(String[] args) {
        System.out.println(findSecondGreater(List.of(4, 6, 1, 8, 10))); // 8
        System.out.println(findSecondGreater(List.of(4, 4, 4, 4, 4)));  // null
    }
}
