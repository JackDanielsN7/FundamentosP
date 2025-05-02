public class Mayuscula2 {
    public static void main(String[] args) {
        String texto="Hola tierra ";

        if (texto.length() > 0) {
            texto = texto.substring(0, 1).toLowerCase() + texto.substring(1);
        }
        
        System.out.println("Texto modificado: " + texto);
        
        String[] tk = texto.split("");

        for(int i = 0; i<tk.length; i++){
            System.out.print(tk[i]);
        }
        for(int i = texto.length()-1; i >=0; i--){
            System.out.print(tk[i]);
        }
    }
       
}
