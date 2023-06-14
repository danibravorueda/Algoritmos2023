package Pruebas;

import java.util.Scanner;

/**
 *  INPUT
 *  2
 *  3
 *  4
 *
 *  OUTOUT
 *  4
 *  6
 *  8
 *
 *
 * */
public class EntradaNumeros4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(2*num);
        }
    }
}
