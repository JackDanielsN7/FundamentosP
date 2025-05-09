/* Escribe un programa que muestre por consola (con un print) los números de 1 a 50
(ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
- Múltiplos de 3 por la palabra "fizz".

  - Múltiplos de 5 por la palabra "buzz".

  - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
  */
public class carpeta1 {
    public static void main(String[]arsg){
        for (int index = 1; index <= 15; index++) {

            boolean divisibleByThree = index % 3 == 0;
            boolean divisibleByFive = index % 5 == 0;

            if (divisibleByThree && divisibleByFive) {
                System.out.print("fizzbuzz ");
            } else if (divisibleByThree) {
                System.out.print("fizz ");
            } else if (divisibleByFive) {
                System.out.print("buzz ");
            } else {
                System.out.print(index + " ");
            }

        }
    }
}
