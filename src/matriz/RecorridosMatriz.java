package matriz;

public class RecorridosMatriz {
    static int [][] matriz = {{1,2,3},
                              {4,5,6},
                              {7,8,9}};

    public static void main(String[] args) {
       // obtenerDiagonalPrincipal();
       // obtenerDIagonalSecundario();
    }

    private static void obtenerDiagonalPrincipal(){
        for (int fila = 0 ;  fila < matriz.length ; fila++){
            for (int col = 0 ; col < matriz[0].length ; col++){
                if (fila==col){
                    System.out.print(matriz[fila][col]+" ");
                }
            }
        }
    }

    private static void obtenerDIagonalSecundario(){
        int fila = matriz.length-1;
            for(int col = 0 ;  col < matriz[0].length ; col++){
                System.out.print(matriz[fila][col]+" ");
                fila--;
            }
    }





}
