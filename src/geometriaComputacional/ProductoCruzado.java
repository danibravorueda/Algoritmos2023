package geometriaComputacional;

import jdk.jfr.consumer.RecordedThread;

import java.io.PrintWriter;
import java.util.Scanner;

/** Producto  CRUZADO
 *  Dado dos puntos se desea saber el sentido de P1 . Hay tres posibles resultados:
 *     > 0 entonces P1 esta en sentido horario de P2
 *     = 0 entonces P1 es colineal a P2, ya sea en el mismo sentido o contrario
 *     < 0 entonces P1 esta en sentido contra horario de P2
 *
 *    INPUT
 *    2
 *    9 6
 *    5 9
 *
 *    6 13
 *    5 9
 *
 *    OUTPUT
 *    P1 esta en sentido horario de P2
 *    P1 esta en sentido contrario de P2
 *
 * */
public class ProductoCruzado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int casos = sc.nextInt();
        while (casos-->0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();

            int X2= sc.nextInt();
            int Y2 = sc.nextInt();

            pw.println(obtenerDistanciaP1(X1,Y1,X2,Y2));
        }
        pw.close();
    }

    private static String obtenerDistanciaP1(int X1,int Y1, int X2,int Y2){
        String res = "";
        int dP1 = X1*Y2 - Y1*X2;
        if (dP1>0){
            res+="P1 esta en sentido horario de P2";
        }else if (dP1==0){
          res+="P1 es colineal a P2 , ya sea en el mismo sentido o contrario";
        }else if (dP1<0){
            res+="P1 esta en sentido contrario de P2";
        }
        return res;
    }
}
