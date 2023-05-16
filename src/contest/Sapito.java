package contest;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sapito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int pos = 0 ; pos < array.length;pos++){
            array[pos] = sc.nextInt();
        }

        pw.println(obtenerCostoMinimo(array));
        pw.close();
    }

    private static int obtenerCostoMinimo(int [] array){
        int res=0;

        return res;
    }
}
