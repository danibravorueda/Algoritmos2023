package recursividad;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int [] array = {1,4,5,3,7,8};
        System.out.println("existe elemento ?"+buscarElem(array,10));
        System.out.println("posicion del elemento buscado:"+obtenerPosElemBuscado(array,2));
    }

    private static boolean buscarElem(int [] array , int elemBus ){
        return busquedaSecuencial(array,0,elemBus);
    }

    private static boolean busquedaSecuencial(int [] array , int posIni , int elemBusq){
        boolean bandera = false;
        if (array[posIni]==elemBusq){
            bandera = true;
        }else{
             if (posIni != array.length-1){
                 bandera = busquedaSecuencial(array,posIni+1 , elemBusq);
             }
        }
        return bandera;
    }

    private static int obtenerPosElemBuscado(int [] array,int num){
        return obtenerPosicion(array,0,num);
    }

    private static int obtenerPosicion(int [] array , int posIni , int elemBusq){
        if (array[posIni]==elemBusq){
            return posIni;
        }else{
            if (posIni!=array.length-1){
                return obtenerPosicion(array,posIni+1,elemBusq);
            }else{
                return -1;
            }
        }
    }
}
