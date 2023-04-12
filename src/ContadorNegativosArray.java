import java.io.PrintWriter;
import java.util.Scanner;

public class ContadorNegativosArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int tam = sc.nextInt();
        int [] array = new int[tam];
        for (int pos = 0 ; pos < array.length ; pos++){
            array[pos] = sc.nextInt();
        }
       // pw.println(contarNegativosConsecutivos(array));
        pw.println(contarNegativosEntreTodos(array));
        pw.close();
    }

    /** FUNCION DEL METODO
     *   tam : 5
     *   array : 1 -2 4 -5 1
     *
     *   (1-2) (-2+4) (4-5) (-5+1)
     *     -1    2      -1    -4
     *
     *  =>  salida : 3 sumas hacen negativo en mi array
     * */
    private static int contarNegativosConsecutivos(int [] array){
        int cont = 0 ;
        for (int pos = 0 ; pos < array.length-1 ; pos++){
           if (array[pos]+array[pos+1] < 0){
               cont++;
           }
        }
        return cont;
    }

    /** FUNCION METODO
     *   tam : 5
     *   array : 1 -2 4 -5 1
     *
     *   (1-2) (1+4) (1-5) (1+1) = 2 negativos
     *   (-2+4) (-2-5) (-2+1)    = 2 negativos
     *   (4-5) (4+1)             = 1 negativo
     *   (-5+1)                  = 1 negativo
     *   (1)
     *
     * salida : se tiene 6 sumas negativas
     *
     * */

    private static int contarNegativosEntreTodos(int [] array){
        int contador = 0 ;
        for (int pos = 0 ; pos < array.length ; pos++){
            for (int sig = pos+1 ; sig < array.length ; sig++){
                if (array[pos]+array[sig]<0){
                    //System.out.print(pos+""+sig+" ");
                    contador++;
                }
            }
        }
        return contador;
    }


}
