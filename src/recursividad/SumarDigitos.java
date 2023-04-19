package recursividad;

public class SumarDigitos {
    public static void main(String[] args) {
        System.out.println(sumarDigitos(1234));
    }

    private static int sumarDigitos(int num){
        if (num<10){
            return num;
        }
        else{
            return (num%10) + sumarDigitos(num/10);
        }
    }
}
