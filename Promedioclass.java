import java.util.Arrays;

import javax.swing.JOptionPane;

public class Promedioclass {
    public static void main(String[] args) {
        int[] nota=new int[5];
        int suma=0;

        for(int i = 0 ; i < nota.length ; i++ ){
            nota[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa nota-1: "+(i+1)));
            suma=suma+nota[i];
        }
        for(int j = 0 ; j < nota.length ; j++){
            double promedio=suma/nota.length;
            System.out.println("Sus notass son: "+Arrays.toString(nota));
            System.out.println("Su promedio es: "+promedio);   
        }
        
    }
}