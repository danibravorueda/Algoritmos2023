package Pruebas;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  INPUT
 *  1 2
 *  2 1
 *  3 2
 *  4 1
 *
 *  OUTPUT
 *  la media es : 3
 *
 * */

public class EntradaNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        while (sc.hasNextInt()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1*num2);
        }

    }
}
