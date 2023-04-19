package recursividad;

public class ContarDigitos {
    public static void main(String[] args) {
        System.out.println(contarDigitosNum(123456));
    }


    private static int contarDigitosNum(int num){
        if (num<10){
            return 1;
        }else{
            return 1 + contarDigitosNum(num/10);
        }
    }
}
