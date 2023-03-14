
/**
 * Convertir un numero en un array
 * */
public class NumeroArrayConvertidor {
    public static void main(String[] args) {
        int [] array = {4,5,6};
        int num = 0;
        for (int pos = 0 ; pos < array.length ; pos++){
             num= num*10 + array[pos];
        }
        System.out.println(num);
    }
}
