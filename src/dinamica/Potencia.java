package dinamica;

import java.util.Arrays;
import java.util.HashMap;

/** Dado un  numero n . obtener sus respectivas potencias usando PD
 *  num  pot(index)
 *  2    0             => 1
 *  2    1             => 2
 *  2    2             => 4
 *  2    3             => 8
 *
 * */
public class Potencia {
    public static void main(String[] args) {
       int [] array ={2,2,2,2};
        System.out.println(Arrays.toString(obtenerListaPotencias(array)));
    }

    private static int [] obtenerListaPotencias(int [] array){
        int [] potencias = new int[array.length];
        HashMap<Integer,Integer> memo =  new HashMap<>();
        for (int pos = 0 ; pos < array.length ; pos++){
             int suPotencia = obtenerPotencia(array[pos],pos,memo);
             potencias[pos] = suPotencia;
             memo.put(pos,suPotencia);
        }
        return potencias;
    }

    private static int obtenerPotencia(int elem ,int pot, HashMap<Integer,Integer> memo){
        if (pot==0){
            return 1;
        }else{
            if (memo.containsKey(pot)){
                return memo.get(pot)*obtenerPotencia(elem,0,memo);
            }else{
                return elem * obtenerPotencia(elem,pot-1,memo);
            }
        }
    }
}
