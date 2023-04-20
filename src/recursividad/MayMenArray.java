package recursividad;

public class MayMenArray {
    public static void main(String[] args) {
        int [] array = {2,3,12,6,7,9,11};
        System.out.println(obtenerElementoMayor(array));
       System.out.println(obtenerElementoMenor(array));
    }

    private static int obtenerElementoMayor(int [] array){
        return obtenerMayor(1,array[0],array);
    }

    private static int obtenerMayor(int posIni ,int may, int [] array){
        if (posIni<array.length){
            if (may < array[posIni]){
                return obtenerMayor(posIni+1,array[posIni],array);
            }else{
                return obtenerMayor(posIni+1,may,array);
            }
        }
        return may;
    }

    private static int obtenerElementoMenor(int [] array){
        return obtenerMenor(0,array[0],array);
    }

    private static int obtenerMenor(int posIni , int menor , int [] array){
        if (posIni < array.length){
            if (array[posIni]<menor){
                return obtenerMenor(posIni+1 , array[posIni],array);
            }else{
                return obtenerMenor(posIni+1 , menor , array);
            }
        }
        return menor;
    }
}
