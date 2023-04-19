package recursividad;

/**
 * 123
 *
 * 300
 * 20
 *  1
 * ----
 * 321
 *
 * */
public class InvertirNumero {
    public static void main(String[] args) {
        System.out.println(obtenerInverso(456));
    }

    private static int obtenerInverso(int num){
        if (num<10){
            return num;
        }else{
            return (num%10)*(int)Math.pow(10,contarDigitos(num)-1)+obtenerInverso(num/10);
        }
    }

    private static int contarDigitos(int num){
        if (num<10){
            return 1;
        }else{
            return 1+contarDigitos(num/10);
        }
    }
}
