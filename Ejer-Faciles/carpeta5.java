/* Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
- out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
- out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
out1: Jv
out2: Kolin
*/
public class carpeta5 {
     public static void printNonCommon(String str1, String str2) {
        String out1 = "";
        String out2 = "";

        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) == -1 && out1.indexOf(c) == -1) {
                out1 += c; 
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.indexOf(c) == -1 && out2.indexOf(c) == -1) {
                out2 += c; 
            }
        }

        System.out.println("out1: " + out1);
        System.out.println("out2: " + out2);
    }

    public static void main(String[] args) {
        String str1 = "Me gusta Java";
        String str2 = "Me gusta Kotlin";
        printNonCommon(str1, str2);

    }
}
