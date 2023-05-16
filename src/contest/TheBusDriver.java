package contest;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2 20 5
 * 10 15
 * 10 15
 * 2 20 5
 * 10 10
 * 10 10
 * 0 0 0
 *
 * */
public class TheBusDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (true){
            int n = sc.nextInt();
            int d =sc.nextInt();
            int r = sc.nextInt();

            if (n==0 && d==0 && r==0)
                break;

            int [] dia =  new int[n];
            int [] noche = new int[n];

            for (int pos = 0 ; pos < dia.length ; pos++){
                dia [pos] = sc.nextInt();
            }
            for (int pos = 0 ; pos < noche.length ; pos++){
                noche[pos] =sc.nextInt();
            }
            pw.println(obtenerMontoMinimo(n,d,r,dia,noche));

        }
        pw.close();
    }

    private static long obtenerMontoMinimo(int n,int d,int r , int [] dia , int [] noche){
        Arrays.sort(dia);
        Arrays.sort(noche);
        long res = 0;
        for (int pos = 0 ; pos < n ; pos++){
            int total = dia[pos] + noche[n-1-pos];
            if (total>d){
                res+=r*(total-d);
            }
        }
        return res;
    }
}
