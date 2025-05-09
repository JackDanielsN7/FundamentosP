/* Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
*/
public class carpeta9 {
    public static void main(String[] args) {
        System.out.println(timeToMillis(0, 0, 0, 10) + " milisegundos");
        System.out.println(timeToMillis(2, 5, 45, 10) + " milisegundos");
    }

    public static long timeToMillis(int dias, int horas, int minutos, int segundos) {
        long totalMilisegundos = 0;

        totalMilisegundos += dias * 24L * 60 * 60 * 1000;
        totalMilisegundos += horas * 60L * 60 * 1000;
        totalMilisegundos += minutos * 60L * 1000;
        totalMilisegundos += segundos * 1000L;

        return totalMilisegundos;
    }
}
