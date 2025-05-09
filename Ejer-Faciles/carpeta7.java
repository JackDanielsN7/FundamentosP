/* Escribe una función que calcule si un número dado es un número de Armstrong (o también llamado narcisista).

 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 * */
public class carpeta7 {

    public static boolean isArmstrong(int numero) {
        if (numero < 0) {
            return false;
        }
        int original = numero;
        int suma = 0;
        int digitos = contarDigitos(numero);

        while (numero > 0) {
            int digito = numero % 10;
            suma += potencia(digito, digitos);
            numero = numero / 10;
        }

        return suma == original;
    }
    private static int contarDigitos(int n) {
        if (n == 0) return 1;
        int contador = 0;
        while (n > 0) {
            contador++;
            n = n / 10;
        }
        return contador;
    }

    private static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }


    public static void main(String[] args) {
         System.out.println(isArmstrong(371));   
        System.out.println(isArmstrong(-371));  
        System.out.println(isArmstrong(372));   
        System.out.println(isArmstrong(0));    
    }
}
