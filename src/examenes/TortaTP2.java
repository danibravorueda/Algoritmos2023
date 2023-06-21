package examenes;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *   INPUT
 *   4
 *   10.0 4.0 1.0
 *   10.0 3.0 1.0
 *   5.0  5.0 1.0
 *   20.0 4.0 5.0
 *
 *   OUTPUT
 *   114.159
 *   184.255
 *   19.099
 *   2283.185
 *
 * */

public class TortaTP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos =  Integer.parseInt(sc.next());
        if (casos>=1 && casos<=300){
            while (casos-->0){
                float radio = Float.parseFloat(sc.next());
                float lados = Float.parseFloat(sc.next());
                float altura = Float.parseFloat(sc.next());
                if (radio>=2 && radio<=2000){
                    if (lados>=3 && lados<=100){
                        if (altura>=1 && altura<=100){
                            pw.println(cantidadLadosTorta(radio,lados,altura));
                        }
                    }
                }
            }
            pw.close();
        }
    }

    private static float cantidadLadosTorta(float radio,float lados , float altura){
        return radio*lados*altura;
    }


}
