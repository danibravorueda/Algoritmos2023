package dinamica;

/**
 *  Dada una varilla de tamanio n y un array de precios de todas las piezas
 *  de tamanio inferior a n . Determine el valor maximo que se puede obtener
 *  cortando la varilla y veniendo las piezas
 * */

public class CorteVarilla {
    public static void main(String[] args) {
        int [] precios = {3,7,1,3,9};
        int n = precios.length;
        System.out.println("max:"+obtenerMaximoValor(n,precios));
    }

    private static int obtenerMaximoValor(int n,int [] precios) {
        int[] memo = new int[n + 1];
        int temp;
        for (int posM = 1; posM <= n; posM++){
            temp = -1;
            for (int posP = 0; posP < posM; posP++){
                temp = Math.max(temp,precios[posP]+memo[posM-posP-1]);
            }
            memo[posM] = temp;
        }
            return memo[n];
    }
}
