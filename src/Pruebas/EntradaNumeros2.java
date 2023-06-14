package Pruebas;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  INPUT
 *  3 1
 *  4 2
 *  5 1
 *  0 0
 *
 *  OUTPUT
 *  3
 *  8
 *  5
 *
 * **/
public class EntradaNumeros2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==0 && b==0){
                break;
            }
            pw.println(a+b);
        }
        pw.close();

    }
}
