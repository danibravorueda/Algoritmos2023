package recursividad;

public class SumarArray {
    public static void main(String[] args) {
        int [] array = {1,2,2,4,5};
        System.out.println(obtenerSuma(array));
    }

    private static int obtenerSuma(int [] array){
        return sumarArray(0,0,array);
    }

    private static int sumarArray(int posIni , int suma, int []array){
        if (posIni < array.length){
            return sumarArray(posIni+1 , suma+array[posIni],array);
        }
        return suma;
    }
}
