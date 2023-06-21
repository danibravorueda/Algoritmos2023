package Pruebas;

public class MatrizValores {
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];
        for (int pos = 0 ; pos < matriz.length ; pos++){
            matriz[pos][0] = pos;
        }
       // mostrar(matriz);
        for (int pos = 0 ; pos < matriz.length ; pos++){
            matriz[0][pos] = pos;
        }
        mostrar(matriz);
    }

    private static void mostrar(int [][] matriz){
        for (int [] elems : matriz){
            for (int elem: elems){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }

}
