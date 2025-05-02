public class Celular {
    String Marca;
    String modelo;
    String color;
    String camara;
    String procesador;
    String andriod;
    String pantalla;


    public void encender(){
        System.out.println("El celular se esta encendiendo ...");

    }

    public boolean clave(String clave){
        if(clave.equals("12345")){
            return true;
        }else{
            return false;
        }

    }

    public void abrirapp(String app){
        System.out.println("Usted esta habriendo la aplicacion: "+app);
        
    }

    public void apagar(){
        System.out.println("El equipo se esta apagando ....");

    }
    public void Vercelular(){
        System.out.println("Marca es: "+Marca);
        System.out.println("Marca es: "+modelo);
        System.out.println("Colore Ele: "+color);
        System.out.println("Marca es: "+camara);
        System.out.println("Marca es: "+procesador);
        System.out.println("Marca es: "+andriod);
        System.out.println("Marca es: "+pantalla);

    }


    public static void main(String[] args) {
        Celular redmi= new Celular();
        redmi.Marca=" xiamo Redmi 9";
        redmi.modelo="redmi 9 lancelot";
        redmi.color="azul";
        redmi.camara="13mp";
        redmi.procesador="Helio G80";
        redmi.andriod="Version MIU 13";
        redmi.pantalla="IPS 6.53";
        redmi.Vercelular();
        redmi.encender();
        if(redmi.clave("12345")){
            redmi.abrirapp("pantalla de Inicio");
        }else{
            redmi.apagar();
        }
    }
}
