/*Crea un programa que determine si dos vectores son ortogonales.
 - Los dos array deben tener la misma longitud.
 - Cada vector se podría representar como un array. Ejemplo: [1, -2]
 */
public class carpeta13 {
    public static boolean areOrthogonal(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud");
        }
        int dotProduct = 0;
        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];
        }
        return dotProduct == 0;
    }
    public static void main(String[] args) {
        System.out.println(areOrthogonal(new int[]{1, 2}, new int[]{2, 1}));      // false
        System.out.println(areOrthogonal(new int[]{2, 1}, new int[]{-1, 2}));     // true

    }
}
