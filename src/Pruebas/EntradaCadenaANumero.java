package Pruebas;

import java.util.Scanner;

/**
 *   INPUT
 *   2 3
 *   2 1
 *   3 4
 *   2 2
 *
 *   OUTPUT
 *   6
 *   2
 *   12
 *   4
 *
 * */
public class EntradaCadenaANumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            if (!line.isEmpty()){
                String [] datos = line.split(" ");
                int a = Integer.parseInt(datos[0]);
                int b = Integer.parseInt(datos[1]);
                multiplicar(a,b);
            }
        }
        //pw.close();
    }

    private static void multiplicar(int a,int b){
        System.out.println(a*b);
    }
}
