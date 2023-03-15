
/**
 *  Dada una matriz se desea obtener la matriz con la primera columa de ceros
 * */

public class MatrizCaracter {
    static  char [][] matriz = {{'x','0','x','x'},
                                {'x','0','x','x'},
                                {'x','x','x','0'},
                                {'x','x','x','0'}};

    public static void main(String[] args) {
        moverCerosPrimeraColumna();

    }

    private static void moverCerosPrimeraColumna() {
        for (int fila = 0 ; fila < matriz.length ; fila++){
            for (int col = 0 ; col < matriz[0].length ; col++){
                    if (matriz[fila][col] == '0'){
                        intercambiarPrimeraColumna(fila,col);
                    }

            }
        }

        imprimir();
    }

    private static void intercambiarPrimeraColumna(int fila,int col){
        char aux = matriz[fila][0];
        matriz[fila][0] = matriz[fila][col];
        matriz[fila][col] = aux;
    }

    private static void imprimir(){
        for (char [] array : matriz){
            for (char elem : array){
                System.out.print(elem+"  ");
            }
            System.out.println();
        }
    }
}
