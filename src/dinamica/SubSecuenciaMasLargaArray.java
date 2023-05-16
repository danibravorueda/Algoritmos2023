package dinamica;

import java.util.ArrayList;
import java.util.List;

/** Subsecuencia mas larga
 *  - Se tiene una lista y se dese encontrar la secuencia maxima que se genera en la lista es decir
 *  [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]
 *
 *  los mejores:
 *  [0, 2, 6, 9, 11, 15]
 *  [0, 4, 6, 9, 11, 15]   => el tam es 6 de las maximas secuencias que se puede formar
 *  [0, 4, 6, 9, 13, 15]  => obtiene la secuencia mas larga
 *
 * */

public class SubSecuenciaMasLargaArray {
    public static void main(String[] args) {
        int[] array = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println("Tamanio de subsecuencia mas larga:" +obtenerTamanioSubsecuenciaMasLarga(array));
        System.out.println("obtener secuencia:"+obtenerListaDeSecuencia(array));
    }

    private static List<Integer> obtenerListaDeSecuencia(int [] array){
      return obtenerSecuencia(array,0);
    }

    private static List<Integer> obtenerSecuencia(int [] array,int posIni){
        if (posIni < array.length){
            List<List<Integer>> list = new ArrayList<>();
            for (int pos = 0 ; pos < array.length ; pos++ ){
                list.add(new ArrayList<>());
            }
            list.get(0).add(array[0]);
            for (int pos = 1 ; pos < array.length ; pos++){
                for (int indice = 0 ; indice < pos ; indice++){
                    if (array[indice]<array[pos] && list.get(indice).size()>list.get(pos).size()){
                        list.set(pos,new ArrayList<>(list.get(indice)));
                    }
                }
                list.get(pos).add(array[pos]);
            }

            int index = 0 ;
            for (int pos = 0 ; pos < array.length ; pos++){
                if (list.get(index).size() < list.get(pos).size()){
                    index =pos;
                }
            }
            return list.get(index);
        }
        return null;
    }


    private static int obtenerTamanioSubsecuenciaMasLarga(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] memo = new int[array.length];
        memo[0] = 1;
        for (int pos = 1; pos < array.length; pos++) {
            for (int indice = 0; indice < pos; indice++) {
                if (array[indice] < array[pos] && memo[indice] > memo[pos]) {
                    memo[pos] = memo[indice];
                }
            }
            memo[pos]++;
        }
        return obtenerMaximoElementoArray(memo);
    }

    private static int obtenerMaximoElementoArray(int[] memo) {
        return obtenerMaximoElem(memo, 0, 0);
    }

    private static int obtenerMaximoElem(int[] array, int posIni, int mayorActual) {
        if (posIni < array.length) {
            if (mayorActual < array[posIni]) {
                return obtenerMaximoElem(array, posIni + 1, array[posIni]);
            } else {
                return obtenerMaximoElem(array, posIni + 1, mayorActual);
            }
        }
        return mayorActual;
    }
}


