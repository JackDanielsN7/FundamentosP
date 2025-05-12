public class carpeta1 {
    public static void main(String[] args) {

        int n=50;
        int n1=0;
        int n2=1;
        int suma=0;
        for (int i = 0; i < 11; i++) {
            System.out.print(n1+" ");
            suma=n1+n2;
            n1=n2;
            n2=suma;
            
        }
    }
}
