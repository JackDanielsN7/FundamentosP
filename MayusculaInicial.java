import javax.swing.JOptionPane;

public class MayusculaInicial {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Ingresa una letra");
        for(int i= 0; i< texto.length() ; i++ ){
            System.out.println(texto.charAt(i));
            if(i==0){
                String letra=String.valueOf(texto.charAt(i)).toUpperCase();
                System.out.println(letra);
            }
            if (i==texto.indexOf("  ")+1) {
                String letra=String.valueOf(texto.charAt(i)).toUpperCase();
                System.out.println(letra);
            }

        }

    }
}
