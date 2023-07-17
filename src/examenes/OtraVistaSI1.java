package examenes;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * INPUT
 * 5
 * 10
 * 1 2 3 4 5 6 7 8 9 10
 * 5
 * 1 4 8 3 10
 * 7
 * 657 87 546 81 81 546 81
 * 5
 * 1 1 1 1 1
 * 1
 * 56
 *
 * OUTPUT
 * 1
 * 4
 * 1
 * 0
 *
 * */
public class OtraVistaSI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw =  new PrintWriter(System.out);
        int casos = sc.nextInt();
        if (casos>=1 && casos<=1000){
            while (casos-->0){
                 int cantidadEdificios = sc.nextInt();
                 int [] array = new int[cantidadEdificios];
                 for (int pos = 0 ; pos < array.length;pos++){
                     array[pos] = sc.nextInt();
                 }
                 pw.println(obtenerCantidadCalaminas(array));
            }
            pw.close();
        }
    }

    private static int obtenerCantidadCalaminas(int [] array){
        HashSet<Integer> lista =  new HashSet<>();
        for (int pos = 0 ; pos < array.length-1;pos++){
            int distancia =  Math.abs(array[pos+1] - array[pos]) ;
            lista.add(distancia);
        }
        return lista.size();
    }

}
