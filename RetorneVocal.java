public class RetorneVocal {
    public static void main(String[] args) {
        String texto = "Tragico noticia terremoto en cementerio varios heridos y muertos";
        String resultado = vocalMasFrecuente(texto);
        System.out.println("La vocal más frecuente es: " + resultado);
    }
    public static String vocalMasFrecuente(String texto) {
        texto = texto.toLowerCase();
        int[] contadores = new int[5];  
        
        for (int i = 0; i < texto.length(); i++) {
            char Vocales = texto.charAt(i);
            
            switch (Vocales) {
                case 'a':
                 contadores[0]++;
                  break;
                case 'e':
                 contadores[1]++;
                  break;
                case 'i':
                 contadores[2]++;
                 break;
                case 'o':
                 contadores[3]++;
                  break;
                case 'u':
                 contadores[4]++;
                 break;
                default: break;
            }
        }
        int mcontador = -1;
        int vocalI = -1;

        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] > mcontador) {
                mcontador = contadores[i];
                vocalI = i;
            }
        }

        if (mcontador == 0) {
            return "";
        }
        switch (vocalI) {
            case 0:
            System.out.println("a");
            case 1:
            System.out.println("e");
            case 2:
            System.out.println("i");
            case 3:
            System.out.println("o");
            case 4:
            System.out.println("u");
            default: return"";


        }
    }
}

