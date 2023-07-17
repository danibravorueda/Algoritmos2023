package examenes;

import java.util.Scanner;

public class CodificadorImposibleSI2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int casos = sc.nextInt();
        if (casos>=1 && casos<=100){
            while (casos-->0){
                int tamanioColecciones = sc.nextInt();
                int [] array = new int[tamanioColecciones];
                for (int pos = 0; pos < array.length;pos++){
                    array[pos] = sc.nextInt();
                }
                System.out.println(imprimir(obtenerSecuenciaA(array)));
            }
        }
    }

    private static int [] obtenerSecuenciaA(int [] array){
        int [] secuenciaOrig = convertirSecuenciaA(array);

        return null;
    }

    private static int [] convertirSecuenciaA(int [] array){
        int [] res =  new int[array.length];
        int a1 = array[0];
        int a2 = array[0]+array[1];

        res[0] = a1;
        res[1] =a2;
        return res;
    }

    private static String imprimir(int [] array){
        String res = "";
        for (int pos = 0 ; pos < array.length;pos++){
            if (array[0]==-1){
              res+="-1";
              break;
            }
            else{
                res+=array[pos]+" ";
            }
        }
        return res;
    }
}
