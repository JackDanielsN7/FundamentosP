import java.lang.reflect.Array;
import java.util.Arrays;

public class InvertiArray {
    public static void main(String[] args) {
        int[] numeros={5,10,12,4,20,7,1,2,6,9};
        System.out.println(Arrays.toString(numeros));

        for(int i=numeros.length-1; i>=0; i--){
            System.out.print(numeros[i]+",");
        }
    }
}
