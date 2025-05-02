public class InvertirTexto {
    String texto;

    public void Invertir(){
        for(int i = texto.length()-1; i >=0 ; i--){

            System.out.println(texto.charAt(i));
        }
        
    }

    public static void main(String[] args) {
        InvertirTexto prueba1= new InvertirTexto();
        prueba1.texto="Ingeniero de Sistemas";
        System.out.println("Texto original"+prueba1.texto);
        prueba1.Invertir();

    
    }
}
