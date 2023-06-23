package geometriaComputacional;

import java.io.*;
import java.util.Scanner;


/**
 *  INPUT
 *   5
 *   0 1
 *   0 2
 *   0 3
 *   0 4
 *   0 5
 *
 *   OUTPUT
 *   SÍ
 *
 *
 * */
public class PuntosEnUnaLinea {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        if (casos>=2 && casos<=10){
            while (casos-->0){
                int [][] matriz =  new int[casos][2];
                for (int fila = 0 ; fila < matriz.length ; fila++){
                    for (int col = 0 ; col < matriz[0].length-1;col++){
                       matriz[fila][col] = sc.nextInt();
                       matriz[fila][col+1] = sc.nextInt();
                    }
                }
                System.out.println(sonLineasVerticalesOHorizontales(matriz));
            }
        }
    }

    private static String sonLineasVerticalesOHorizontales(int [][] matriz){
        String res = "";
        if (esLineaHorizontal(matriz)){
            res+="YES";
        }else if (esLineaVertical(matriz)){
            res+="YES";
        }else{
            res+="NO";
        }
       return res;
    }

    /** Son Lineas verticales si comparten el mismo eje de coordenadas Y */
    private static boolean esLineaHorizontal(int [][] matriz){
        boolean bandera = false;
        int Y = matriz[0][1];
       for (int fila = 0 ; fila < matriz.length ; fila++){
           if (matriz[fila][1] == Y){
               bandera = true;
           }
       }
        return bandera;
    }

    /**  Son lineas horizontales si comparten el mismo eje de coordenandas X */
    private static boolean esLineaVertical(int [][] matriz){
        boolean bandera = false;
        int  X = matriz[0][0];
        for (int col = 0 ; col < matriz.length;col++){
            if (matriz[0][col] == X){
                bandera = true;
            }
        }
        return bandera;
    }
}
