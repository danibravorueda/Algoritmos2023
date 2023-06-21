package Pruebas;

import java.io.PrintWriter;
import java.util.Scanner;


/** Recibe entradas de deciamles
 *  INPUT
 *   3
 *   0.5
 *   2.5
 *   1.2
 *
 *   OUTPUT
 *    0.25
 *    1.25
 *    0.6000000238418579
 *
 * */
public class EntradaDecimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos = Integer.parseInt(sc.next());
        while (casos-->0){
            double num = Float.parseFloat(sc.next());
            pw.println(num*0.5);
        }
        pw.close();
    }
}
