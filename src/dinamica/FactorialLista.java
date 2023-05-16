package dinamica;

import java.util.Arrays;
import java.util.HashMap;

/**
 *  Dado un array , devolver sus factoriales de cada elemento en otra lista usando PD
 *
 * */
public class FactorialLista {
    public static void main(String[] args) {
        int [] array = {2,4,6}; // => 2 , 24 , 240
        System.out.println(Arrays.toString(obtenerFactorialLista(array)));
    }

    private static int [] obtenerFactorialLista(int [] array){
        HashMap<Integer,Integer> memo = new HashMap<>();
        int [] factoriales =  new int[array.length];
        for (int pos = 0 ; pos < array.length ; pos++){
            int suFactorial  = obtenerFactorial(array[pos],memo);
            factoriales[pos] = suFactorial;
            memo.put(array[pos],suFactorial);
        }
        return factoriales;
    }

    private static int obtenerFactorial(int elem , HashMap<Integer,Integer> memo){
        if (elem!=0){
            if (memo.containsKey(elem)){
                return memo.get(elem) * obtenerFactorial(0,memo);
            }
            else{
                return  elem * obtenerFactorial(elem-1,memo);
            }
        }
        return 1;
    }
}
