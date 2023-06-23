package dinamica;

import java.util.ArrayList;
import java.util.List;


/** MAXIMA SUMA 1D
 *  Dada una secuencia de numeros se desea encontrar la maxima suma de elementos adyacentes
 *  [4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2]
 *  => mejor suma es 21
 *
 * */
public class MaximaSuma1d {
    public static void main(String[] args) {
        int [] array = {4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2};
        List<Integer> secuenciaSuma = new ArrayList<>();
        int maximaSuma = obtenerMaximaSuma(array,secuenciaSuma);


        //Se quiere saber la secuencia que genera esta maxima suma
        System.out.println(secuenciaSuma);
        System.out.println("maxima Suma:"+maximaSuma);

    }

    private static int obtenerMaximaSuma(int [] array,List<Integer> secuencia){
        int suma = 0;
        int anterior = 0;
        int sec;
        for (int pos = 0 ; pos < array.length ; pos++){
            sec = array[pos];
            suma+=sec;
            if (suma>anterior) {
                anterior = suma;
                secuencia.add(sec);
            }if (suma<0) {
                suma = 0;
            }
        }
        return anterior;
    }
}
