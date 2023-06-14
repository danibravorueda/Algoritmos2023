package dinamica;

public class MochilaSinRepeticion {
    public static void main(String[] args) {
        int[] peso = {0, 2, 4, 6, 3, 4, 8};
        int[] valor = {0, 10, 5, 20, 2, 6, 1};

        int [][] memo =calcularPesos(peso,valor);
        imprimir(memo);

    }

    private static int [][] calcularPesos(int [] peso , int [] valor){
        int n = peso.length;
        int[][] memo = new int[11][valor.length];
        for (int pos = 1; pos < memo.length; pos++) {
            for (int i = 1; i < n; i++) {
                if(pos >= peso[i]){
                    memo[pos][i] = Math.max(valor[i] + memo[pos - peso[i]][i - 1], memo[pos][i - 1]);
                }
                else{
                    memo[pos][i] = memo[pos][i - 1];
                }
            }
        }
        return memo;
    }

    private static void imprimir(int [][] matriz){
        for (int [] array : matriz){
            for (int elem:array){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
