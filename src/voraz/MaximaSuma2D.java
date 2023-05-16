package voraz;

public class MaximaSuma2D {
    public static void main(String[] args) {
        int [][] matriz = {{0,-2,-7,0},
                           {9,2,-6,2},
                           {-4,1,-4,1},
                           {-1,8,0,-2}};

        //System.out.println("Matriz Original");
        //imprimirMatriz(matriz);
        int [][] suma =  new int[matriz.length][matriz.length];
        calcularMatrizSuma(matriz,suma);

        System.out.println("Matriz Suma :");
        imprimirMatriz(suma);
    }

    private static void calcularMatrizSuma(int [][] matriz,int [][] suma){
        for (int fila = 0 ; fila< matriz.length;fila++){
            for (int col = 0 ; col < matriz[0].length; col++){
                suma[fila][col] = matriz[fila][col];
                if (fila > 0){
                    suma[fila][col]+=suma[fila-1][col];
                }
                if (col > 0){
                    suma[fila][ col]+= suma[fila][col-1];
                }
                if (fila > 0 && col >0){
                    suma[fila][col] -=suma[fila-1][col-1];
                }
            }
        }
    }

    private static void imprimirMatriz(int [][] matriz){
       for(int [] fila:matriz){
           for(int elem : fila){
               System.out.print(elem+"  ");
           }
           System.out.println();
       }

    }
}
