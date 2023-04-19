package recursividad;

public class Multiplicar {
    public static void main(String[] args) {
        System.out.println(obtenerMultiplicacion(2,9));
    }

    private static int obtenerMultiplicacion(int num1,int num2){
        if (num2==0){
          return num2;
        }else{
            return num1+obtenerMultiplicacion(num1,num2-1);
        }
    }
}
