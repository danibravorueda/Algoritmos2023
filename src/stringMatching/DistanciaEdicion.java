package stringMatching;

/**
 *  ALGORITMO NEEDLEMAN WUNSCH mejora del algoritmo de Edicion
 *  Dada dos cadenas se obtiene la diferencia que se tiene entre estas dos cadenas aplica programacion dinamica
 *
 * */
public class DistanciaEdicion {
    public static void main(String[] args) {
        String cadena1 = "Polinomial";
        String cadena2 = "Politico";
        System.out.println(obtenerDiferenciasPalabras(cadena1,cadena2));
    }

    private static int obtenerDiferenciasPalabras(String cadena1,String cadena2){
        char[] arrayCadena1 = cadena1.toCharArray();
        char[] arrayCadena2 = cadena2.toCharArray();
        int[][] map = new int[arrayCadena1.length+1][arrayCadena2.length+1];
        for(int i = 0;i<=arrayCadena1.length;i++){
            map[i][0] = i;
        }
        for(int j = 0;j<=arrayCadena2.length;j++){
            map[0][j] = j;
        }
        for(int i = 1;i<=arrayCadena1.length;i++){
            for(int j = 1;j<=arrayCadena2.length;j++){
                if(arrayCadena1[i-1]==arrayCadena2[j-1])
                    map[i][j] = map[i-1][j-1];
                else
                    map[i][j] = Math.min(Math.min(map[i-1][j],map[i][j-1]),map[i-1][j-1])+1;
            }
        }
        return map[arrayCadena1.length][arrayCadena2.length];
    }
}
