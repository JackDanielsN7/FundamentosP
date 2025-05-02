public class CadenaTexto {
    public static void main(String[] args) {
        String texto="Ingenieria de sistemas calidad";
        String saludo="hola";
        System.out.println("El tamañ de texto es: "+texto.length());
        System.out.println("Mayusculas: "+texto.toUpperCase());
        System.out.println("Minusculas: "+texto.toLowerCase());
        if(saludo.trim().equals("hola")){
            System.out.println("Son iguales:");
        }else{
           System.out.println("No son Iguales"); 
        }
        System.out.println("------Recortar sistemas---------");
        System.out.println(texto.substring(14, 22));
        System.out.println("------Recortar La ultima palabra---------");
        System.out.println(texto.indexOf(" "));
        System.out.println(texto.substring(texto.lastIndexOf(" ")+1,texto.length()));

    }
}
