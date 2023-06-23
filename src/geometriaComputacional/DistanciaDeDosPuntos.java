package geometriaComputacional;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Dadas las coordenadas de dos puntos en un plano cartesiano . calcular la distancia entre ellos
 *  dAB = RaizCuadrada(X2-X1^2 + Y2-Y1^2)
 *
 *  INPUT
 *   2
 *   4 2
 *   1 5
 *
 *   8 6
 *   -4 1
 *
 *   OUTPUT
 *
 *   13
 * **/
public class DistanciaDeDosPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw =  new PrintWriter(System.out);
        int casos = sc.nextInt();
        while (casos --> 0){
            int PX1 = sc.nextInt();
            int PX2 = sc.nextInt();

            int PY1 = sc.nextInt();
            int PY2 = sc.nextInt();

            pw.println(obtenerDistanciaPuntos(PX1,PX2,PY1,PY2));
        }
        pw.close();
    }

    private static double obtenerDistanciaPuntos(int X1,int Y1,int X2,int Y2){
        int X = (X2-X1);
        int Y = (Y2-Y1);
      double distanciaAB = Math.sqrt((int)Math.pow(X,2)+ (int)Math.pow(Y,2));
      return distanciaAB;
    }
}
