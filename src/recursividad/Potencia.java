package recursividad;

public class Potencia {
    public static void main(String[] args) {
        System.out.println(obtenerPotencia(2,4));
    }

    private static int obtenerPotencia(int a , int b){
        if (b==0){
            return 1;
        }else{
            return a*obtenerPotencia(a , b-1);
        }
    }

}
