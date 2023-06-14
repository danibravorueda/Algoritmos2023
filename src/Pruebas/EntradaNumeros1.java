package Pruebas;

import java.io.PrintWriter;
import java.util.Scanner;


/**
 *  INPUT
 *  3
 *  2 2
 *  3 2
 *  4 4
 *
 *  OUTPUT
 *  4
 *  6
 *  16
 *
 * */
public class EntradaNumeros1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw =  new PrintWriter(System.out);

        int casos = sc.nextInt();
        while (casos-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            pw.println(a*b);
        }
        pw.close();

    }
}
