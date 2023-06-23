package geometriaComputacional;

/** PUNTOS
 *  Se quiere conocer el angulo ABC , dado que A , B , C son puntos donde el punto B es el centro
 *
 * */
public class AnguloPuntos {
    public static void main(String[] args) {
        int X1 = 3;
        int Y1 = 8;

        int X2 = 7;
        int Y2 = 2;

        int X3 = 17;
        int Y3 = 9;

        System.out.println(obtenerAnguloDePuntos(X1,Y1,X2,Y2,X3,Y3));
    }

    private static double obtenerAnguloDePuntos(int X1,int Y1,int X2,int Y2,int X3,int Y3){
        int BAx = X2-X1;
        int BAy = Y2-Y1;

        int BCx = X2-X3;
        int BCy = Y2-Y3;

        int BA_BC =BAx*BCx+BAy*BCy;

        double distanciaBA = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));
        double distanciaBC = Math.sqrt(Math.pow((X2-X3),2)+Math.pow((Y2-Y3),2));
        double multi_BA_BC = distanciaBA*distanciaBC;

        double angulo = BA_BC / formatearDecimales(multi_BA_BC,10) ;
        return Math.asin(angulo) ;
    }
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
}
