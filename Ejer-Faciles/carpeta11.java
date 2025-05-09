/*Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
  -¿De cuántas maneras eres capaz de hacerlo?
  */
public class carpeta11{
    public static void contarConFor() {
        System.out.println("Contando con for:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
    public static void contarConWhile() {
        System.out.println("Contando con while:");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
    public static void contarConDoWhile() {
        System.out.println("Contando con do-while:");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
    public static void main(String[] args) {
        contarConFor();
        contarConWhile();
        contarConDoWhile();
    }
}
    
   
