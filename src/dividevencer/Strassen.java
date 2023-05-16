package dividevencer;

public class Strassen {
    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3, 4 },
                      { 4, 3, 0, 1 },
                      { 5, 6, 1, 1 },
                      { 0, 2, 5, 6 } };

        int[][] B = { { 1, 0, 5, 1 },
                      { 1, 2, 0, 2 },
                      { 0, 3, 2, 3 },
                      { 1, 2, 1, 2 } };

        int [][] matrizRespuesta = multiplicacionStrassen(A,B);
        imprimir(matrizRespuesta);

    }

    private static void imprimir(int [][] matrizRespuesta){
        for (int [] lista : matrizRespuesta){
            for ( int elem : lista ){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }

    private static int [][] multiplicacionStrassen(int [][] matrizA , int [][] matrizB){
      int n =matrizA.length;
      int [][] respuesta = new int[n][n];
      if (n == 1){
        respuesta[0][0] = matrizA[0][0] * matrizB[0][0];
      }
      else{
          int[][] A1 = new int[n / 2][n / 2];
          int[][] A2 = new int[n / 2][n / 2];
          int[][] A3 = new int[n / 2][n / 2];
          int[][] A4 = new int[n / 2][n / 2];

          int[][] B1 = new int[n / 2][n / 2];
          int[][] B2 = new int[n / 2][n / 2];
          int[][] B3 = new int[n / 2][n / 2];
          int[][] B4 = new int[n / 2][n / 2];

          separar(matrizA,A1,0,0);
          separar(matrizA,A2,0,n/2);
          separar(matrizA,A3,n/2,0);
          separar(matrizA,A4,n/2,n/2);

          separar(matrizB,B1,0,0);
          separar(matrizB,B2,0,n/2);
          separar(matrizB,B3,n/2,0);
          separar(matrizB,B4,n/2,n/2);


          int[][] P1 = multiplicacionStrassen(suma(A1, A4), suma(B1, B4));
          int[][] P2 = multiplicacionStrassen(suma(A3, A4), B1);
          int[][] P3 = multiplicacionStrassen(A1, resta(B2, B4));
          int[][] P4 = multiplicacionStrassen(A4, resta(B3, B1));
          int[][] P5 = multiplicacionStrassen(suma(A1, A2), B4);
          int[][] P6 = multiplicacionStrassen(resta(A3, A1), suma(B1, B2));
          int[][] P7 = multiplicacionStrassen(resta(A2, A4), suma(B3, B4));

          int[][] subMatrizA = suma(resta(suma(P1, P4), P5), P7);
          int[][] subMatrizB = suma(P3, P5);
          int[][] subMatrizC = suma(P2, P4);
          int[][] subMatrizD = suma(resta(suma(P1, P3), P2), P6);

          union(subMatrizA, respuesta, 0, 0);
          union(subMatrizB, respuesta, 0, n / 2);
          union(subMatrizC, respuesta, n / 2, 0);
          union(subMatrizD, respuesta, n / 2, n / 2);
      }
      return respuesta;
    }


    private static int [][] suma(int [][] matrizA,int [][] matrizB){
      int [][] suma =  new int[matrizA.length][matrizA.length];
        for (int fila = 0 ; fila < suma.length ; fila++){
            for (int col = 0 ; col < suma[0].length ; col++){
                suma[fila][col] = matrizA[fila][col] + matrizB[fila][col];
            }
        }
      return suma;
    }

    private static int [][] resta(int [][] matrizA,int [][] matrizB){
        int [][] resta = new int[matrizA.length][matrizA.length];
        for (int fila = 0 ; fila < resta.length ; fila++){
            for (int col = 0 ; col < resta[0].length ; col++){
                resta[fila][col] = matrizA[fila][col] - matrizB[fila][col];
            }
        }
        return resta;
    }

    private static void union(int [][] matrizOrigen, int [][] subMatrizAsig , int posIni,int posFin){
      for (int fila1 = 0 , fila2 = posIni ; fila1<matrizOrigen.length;fila1++,fila2++){
           for (int col1 = 0 , col2 = posFin ; col1<matrizOrigen.length ; col1++ , col2++){
               subMatrizAsig[fila2][col2] =matrizOrigen[fila1][col1];
           }
      }
    }

    private static void separar(int [][] matrizOrigen, int [][] subMatrizAsig , int posIni,int posFin){
        for (int fila1 = 0 , fila2 = posIni ; fila1<subMatrizAsig.length;fila1++,fila2++){
            for (int col1 = 0 , col2 = posFin ; col1<subMatrizAsig.length ; col1++ , col2++){
                subMatrizAsig[fila1][col1] = matrizOrigen[fila2][col2];
            }
        }
    }



}
