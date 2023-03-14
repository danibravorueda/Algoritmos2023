
/**
 * Convertir un array en un numero
 * */
public class ArrayNumero {
    public static void main(String[] args) {
        int [] array = {2,3,4};
        int tam = array.length;
        int num = 0;
        for (int pos = 0 ; pos < array.length;pos++){
            num+= array[pos]* (int)Math.pow(10,tam-(pos+1));
        }
        System.out.println(num);
    }
    }

