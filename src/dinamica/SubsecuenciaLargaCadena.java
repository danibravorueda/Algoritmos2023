package dinamica;

public class SubsecuenciaLargaCadena {
    public static void main(String[] args) {
        String s1 = "Hillfinger";
        String s2 = "Hilfiger";

        int tamMayorSecuencia = obtenerTamanioMayorSecuencia(s1,s2);

        //RESPUESTA Hilfiger
        System.out.println("Tamanio de mayor subsecuencia :"+tamMayorSecuencia);
    }


    private static int obtenerTamanioMayorSecuencia(String s1,String s2){
        int n = s1.length();
        int m = s2.length();

        int [][] solutionMatriz = new int[n+1][m+1];
        // llenar primera columa con 0
        for (int pos = 0 ; pos < n ; pos++){
            solutionMatriz[pos][0] = 0;
        }
        // llenar primera fila con 0
        for (int pos = 0 ; pos < m;pos++){
            solutionMatriz[0][pos] = 0 ;
        }

        for (int fila = 1; fila <=n ; fila++){
            for (int col = 1 ;col <=m ;col++ ){
                int max1,max2,max3;
                max1 = solutionMatriz[fila-1][col];   // 0 1
                max2 = solutionMatriz[fila] [col-1];   // 1 0

                if (s1.charAt(fila-1) == s2.charAt(col-1)){
                    max3 =solutionMatriz[fila-1] [col-1]+1;
                }else{
                    max3 =solutionMatriz[fila-1][col-1];
                }
                int temp =Math.max(max1,max2);
                solutionMatriz[fila][col] = Math.max(temp,max3);
            }
        }
        return solutionMatriz[n][m];
    }
}
