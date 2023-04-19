package estructurasDatos;

import java.util.HashMap;

public class MiHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> mapa =  new HashMap();

        anadirElementos(mapa);
        System.out.println("----------------------------------------\n");
        System.out.println("mostrar elementos Clave Y Valor:");
        System.out.println(mostrarElementosClaveValor(mapa));

        System.out.println("----------------------------------------\n");
        System.out.println("mostrar valores:");
        System.out.println(mostrarValores(mapa));

        System.out.println("----------------------------------------");
        System.out.println("mostrar claves");
        System.out.println(mostrarClaves(mapa));

        System.out.println("----------------------------------------");
        System.out.println("mapa toString");
        System.out.println(mostrarMapatoString(mapa));

        System.out.println("----------------------------------------");
        System.out.println("obtener valor por la clave:");
        System.out.println(obtenerValorPorClave(mapa));

        System.out.println("----------------------------------------");
        System.out.println("eliminar elemento por clave:");
        System.out.println("Se elimino el siguiente elemento:"+eliminarElementoPorClave(mapa));
        System.out.println(mostrarElementosClaveValor(mapa));

        System.out.println("----------------------------------------");
        System.out.println("tamanio mapa:"+obtenerTamanio(mapa));

        System.out.println("----------------------------------------");
        System.out.println("Existe valor en el mapa:"+existeValor(mapa));

        System.out.println("----------------------------------------");
        System.out.println("Existe clave en el mapa:"+existeClave(mapa));
    }

    private static boolean existeClave(HashMap<Integer,String> mapa){
        return mapa.containsKey(3);
    }

    private static boolean existeValor(HashMap<Integer,String> mapa){
        return mapa.containsValue("maria");
    }

    private static int obtenerTamanio(HashMap<Integer,String> map){
        return map.size();
    }

    private static String eliminarElementoPorClave(HashMap<Integer,String> map){
        return  map.remove(3);
    }

    private static String obtenerValorPorClave(HashMap<Integer,String> map){
        return map.get(3);
    }

    private static void anadirElementos(HashMap<Integer,String> map){
        map.put(1,"primero");
        map.put(2,"segundo");
        map.put(3,"tercero");
        map.put(4,"cuarto");
        map.put(5,"quinto");
        map.put(5,"quinto");
        map.put(1,"primero");
    }

    private static String mostrarElementosClaveValor(HashMap<Integer,String> map){
        StringBuilder sb = new StringBuilder();
        for (Integer clave : map.keySet()){
            sb.append("clave:"+clave).append(" ").append("valor:"+map.get(clave)).append("\n");
        }
        return sb.toString();
    }


    private static String mostrarValores(HashMap<Integer,String> map){
        StringBuilder sb = new StringBuilder();
        for (String valor: map.values()){
            sb.append(valor).append(" ");
        }
        return sb.toString();
    }


    private static String mostrarClaves(HashMap<Integer,String> map){
        StringBuilder sb = new StringBuilder();
        for (Integer clave:map.keySet()){
            sb.append(clave).append(" ");
        }
        return sb.toString();
    }

    private static String mostrarMapatoString(HashMap<Integer,String> map){
        return map.toString();
    }
}
