package matriz;

public class InvertirMatriz {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3,4,5},
                           {6,7,8,9,10},
                           {11,12,13,14,15}};

        //invertirFilasMatriz(matriz);
        //imprimir(matriz);

       // invertirColumnas(matriz);
      //  imprimir(matriz);

         invertirDiagonal(matriz);
        imprimir(matriz);
    }

    /**
     * Invierte todas las columnas de la matriz
     * */
    private static void invertirColumnas(int [][] matriz){
        for (int col = 0 ; col < matriz[0].length ; col++){
            invertirColumna(col,matriz);
        }
    }

    private static void invertirColumna(int col , int [][] matriz){
        for (int filaArriba = 0 , filaAbajo = matriz.length-1 ; filaArriba<=filaAbajo ; filaArriba++,filaAbajo--){
            int aux = matriz[filaArriba][col];
            matriz[filaArriba][col]= matriz[filaAbajo][col];
            matriz[filaAbajo][col] = aux;
        }
    }

    /**
     * Invierte todas las Filas de una matriz
     **/

    private static void invertirFilasMatriz(int [][] matriz){
        for (int fila = 0 ;  fila < matriz.length ; fila++){
            invertirFila(fila,matriz);
        }
    }

    /**
     * Invertir Diagonal Principal
     * */
    private static void invertirDiagonal(int [][] matriz){
        int aux;
        for (int fila = 0 , col = matriz.length-1 ; fila<=col; fila++,col--){
            aux = matriz[fila][fila];
            matriz[fila][fila] = matriz[col][col];
            matriz[col][col] = aux;
        }
    }

    private static void invertirFila(int fila , int [][] matriz){
        for (int colIzq = 0 , colDer = matriz[0].length-1; colIzq<=colDer ; colIzq++ , colDer--){
            int aux = matriz[fila][colIzq];
            matriz[fila][colIzq] = matriz[fila][colDer];
            matriz[fila][colDer] = aux;
        }

    }

    private static void imprimir(int [][] matriz){
        for(int [] array:matriz){
            for (int elem:array){
                System.out.print(elem+"  ");
            }
            System.out.println();
        }
    }


}
