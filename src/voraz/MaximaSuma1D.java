package voraz;


import java.util.ArrayList;
import java.util.List;

/** MAXIMA SUMA 1D
 *  Dada una secuencia de numeros se desea encontrar la maxima suma de elementos adyacentes
 *  [4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2]
 *  => mejor suma es 21
 *
 * */
public class MaximaSuma1D {
    public static void main(String[] args) {
        int [] array = {4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2};
        List<Integer> memo = new ArrayList<>();
        int maximaSuma = obtenerMaximaSuma(array,memo);
        System.out.println("maxima Suma:"+maximaSuma);
    }

     private static int obtenerMaximaSuma(int [] array , List<Integer> memo){
        return obtenerMaximo(array,0,memo);
     }

     private static int obtenerMaximo(int [] array,int pos,List<Integer>memo){
         int maximaSuma = 0;
       if (pos < array.length){
           int suma = 0;
           suma+= array[pos] + obtenerMaximo(array,pos+1,memo);
           if (suma>maximaSuma){
               maximaSuma = suma;
           }
       }
       return maximaSuma;
     }
}
