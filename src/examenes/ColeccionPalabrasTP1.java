package examenes;

/**   INPUT
 *      3
 *      3
 *      ability
 *      ability
 *      able
 *      abilidad
 *
 *      OUTPUT
 *        2
 * */

import java.util.Scanner;

public class ColeccionPalabrasTP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X>=0 && X<=10){
            int cantidadPalabras = sc.nextInt();
            if (cantidadPalabras>=1 && cantidadPalabras<=1000){
                String texto = sc.next();
                if (texto.length()<=20){
                    String [] palabras =  new String[cantidadPalabras];
                    for (int pos = 0 ; pos< palabras.length;pos++){
                        palabras[pos] = sc.next();
                    }
                    System.out.println(obtenerPalabrasDeCoincidencia(X,texto,palabras));
                }
            }
        }
    }

    private static int obtenerPalabrasDeCoincidencia(int X , String texto,String [] palabras){
        int cont = 0;
        for (String elem:palabras){
            if (contarDiferenciaPalabra(texto,elem)<=X){
                cont++;
            }
        }
        return cont;
    }

    /** Algoritmo Needkeman Wunsch */
    private static int contarDiferenciaPalabra(String texto,String elem){
        char[] arrayCadena1 = texto.toCharArray();
        char[] arrayCadena2 = elem.toCharArray();
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
