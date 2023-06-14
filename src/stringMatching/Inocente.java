package stringMatching;

import java.util.Scanner;
/**Verifica si se tiene el patron en el texto solo una vez*/

public class Inocente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String patron = sc.nextLine();
        boolean bandera = false;
        String temp = "";
        int posPatron = 0 ;
        for (int pos = 0 ; pos < cadena.length() && !bandera; pos++){
           if (cadena.charAt(pos)==patron.charAt(posPatron)){
               temp+=cadena.charAt(pos);
               if (temp.equals(patron) ){
                   System.out.println("existe patron");
                   bandera = true;
               }else{
                   posPatron++;
               }

           }else{
               temp = "";
               posPatron=0;
           }
        }

    }
}
