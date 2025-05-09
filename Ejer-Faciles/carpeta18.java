/* Crea una función que retorne el número total de bumeranes de un array de números enteros e imprima cada uno de ellos.

 - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números seguidos, en el que el primero y el último son iguales, y el segundo es diferente. Por ejemplo [2, 1, 2].

  - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
  Resultado
  [2, 1, 2]
  [4, 2, 4]
  */

import java.util.List;

public class carpeta18 {
    public static int contarBumeranes(List<Integer> lista){
        int contador=0;
        for (int i = 0; i < lista.size()-2; i++) {
            int a=lista.get(i);
            int b=lista.get(i +1);
            int c=lista.get(i +2);

            if (a== c && a != b) {
                System.out.println("Bumeras encontrados: [" +a+ "," +b+ "," +c+ "]");
                contador++;
            }
            
        }
        return contador;
    }
    
    public static void main(String[] args) {
        List<Integer>numero=List.of(2,1,2,3,3,4,2,4);
        int totalbumeranes =contarBumeranes(numero);
        System.out.println("total bumeranes: "+totalbumeranes);
    }
}
