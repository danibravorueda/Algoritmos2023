package recursividad;

public class SumarNumeros {
    public static void main(String[] args) {
        System.out.println(sumarNnumeros(5));
    }

    private static int sumarNnumeros(int n){
        if (n==0){
            return 0;
        }else{
            return  n+sumarNnumeros(n-1);
        }
    }
}
