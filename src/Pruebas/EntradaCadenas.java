package Pruebas;

import java.util.Scanner;

/**    INPUT
 *     daniela
 *     mario
 *     hola
 *
 *     OUTPUT
 *     4
 *     3
 *     2
 * */

public class EntradaCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //PrintWriter pw = new PrintWriter(System.out);
        while (sc.hasNextLine()){
            String line = sc.next();
            System.out.println(contarVocales(line));
        }
       // pw.close();
    }

    private static int contarVocales(String line){
        int cont = 0 ;
        for (char  elem : line.toCharArray()){ // convierte en un array de caracteres
            if (elem=='a' || elem=='e' || elem=='i'|| elem=='o'|| elem=='u'){
                cont++;
            }
        }
        return cont;
    }


}
