package voraz;

import java.util.ArrayList;
import java.util.List;

/** MAXIMA SUMA 1D
 *  Dada una secuencia de numeros se desea encontrar la maxima suma de elementos adyacentes
 *  [4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2]
 *  => mejor suma es 21
 *
 * */

public class SumaMaxYMin1D {
    public static void main(String[] args) {
        int [] array = {4,5,6,-2,-4,5,6,1,-13,-5,6,7,-2};
        //int [] array2 = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
        List<Integer> secuenciaSuma = new ArrayList<>();
        int mejorSuma = obtenerMaximaSuma(array,secuenciaSuma);
        System.out.println(mejorSuma);
        System.out.println(secuenciaSuma);

        int minimaSuma = obtenerMinimaSuma(array,secuenciaSuma);
        System.out.println(minimaSuma);

        /* Se quiere saber la secuencia que genera esta maxima suma* */
        System.out.println(secuenciaSuma);
    }

    private static int obtenerMaximaSuma(int [] array,List<Integer> secuencia){
        int suma = 0;
        int anterior = 0;
        int menorActual= Integer.MIN_VALUE;
        int actual;
        for (int pos = 0 ; pos < array.length ; pos++){
            actual = array[pos];
            if(menorActual < actual ){
                suma+=actual;
                menorActual = actual;
                if (suma>anterior) {
                    anterior = suma;
                    secuencia.add(actual);
                }if (suma<0) {
                    suma = 0;
                }
            }
        }

        return anterior;
    }

    private static int obtenerMinimaSuma(int [] array,List<Integer> secuencia){
        ////0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11
        ///respuesta: 8,12,14
        int suma = 0;
        //int anterior = 0;
        int menorActual= 0;
        int actual;
        for (int pos = 0 ; pos < array.length ; pos++){
            actual = array[pos];
            if(menorActual < actual ){
                suma+=actual;
                menorActual = actual;
                secuencia.add(actual);

            }
            else{
                suma=actual;
                menorActual = actual;
                secuencia.clear();
                secuencia.add(actual);
            }
        }
        return suma;
    }
}
