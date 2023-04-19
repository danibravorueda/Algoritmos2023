package recursividad;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(obtenerPosicionElem(array, 7));
    }

    private static int obtenerPosicionElem(int[] array, int elem) {
        return busquedaBinaria(0, array.length -1, array, elem);
    }

    private static int busquedaBinaria(int posIni, int posFin, int[] array, int elemBusq) {
        if (posIni <= posFin) {
            int medio = (posIni + posFin)/ 2;
            if (array[medio] == elemBusq) {
                return medio;
            } else {
                if (elemBusq > array[medio]) {
                    return busquedaBinaria(medio+1, posFin, array, elemBusq);
                } else if (elemBusq < array[medio]) {
                    return busquedaBinaria(posIni, medio - 1, array, elemBusq);
                }
            }
        }
        return -1;
    }
}



