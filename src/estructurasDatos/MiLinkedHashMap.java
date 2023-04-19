package estructurasDatos;

import java.util.LinkedHashMap;

/**
 *  Conserva orden de inserccion
 *
 * */
public class MiLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> mapa = new LinkedHashMap<>();

        anadirElementos(mapa);

        System.out.println("-------- Mostrar Mapa ------------------");
        System.out.println(mostrarMapa(mapa));
        System.out.println(mostrarMapa2(mapa));

        System.out.println("--------------------------------------");
        System.out.println("Se elimino el siguiente elemento:"+eliminarElemento(mapa));
        System.out.println(mostrarMapa(mapa));

        System.out.println("-----------------------------------------");
        System.out.println("contiene esa clave? "+existeClave(mapa));

        System.out.println("-----------------------------------------");
        System.out.println("contiene ese valor? "+existeValor(mapa));

        System.out.println("----------------------------------------");
        System.out.println("tamanio mapa:"+obtenerTamanio(mapa));

        System.out.println("----------------------------------------");
        System.out.println("obtener valor por la clave:"+obtenerValorPorClave(mapa));

        System.out.println("----------------------------------------");

    }


    private static String obtenerValorPorClave(LinkedHashMap<Integer,String> mapa){
        return mapa.get(5);
    }

    private static int obtenerTamanio(LinkedHashMap<Integer,String> map){
        return map.size();
    }

    private static boolean existeValor(LinkedHashMap<Integer,String> mapa){
        return mapa.containsValue("dani");
    }

    private static boolean existeClave(LinkedHashMap<Integer,String> mapa){
        return mapa.containsKey(2);
    }

    private static String eliminarElemento(LinkedHashMap<Integer,String> mapa){
        return mapa.remove(2);
    }


    private static void anadirElementos(LinkedHashMap<Integer,String> mapa){
        mapa.put(4,"dani");
        mapa.put(1,"ana");
        mapa.put(3,"carla");
        mapa.put(2,"bertha");
        mapa.put(5,"fabi");
    }

    private static String mostrarMapa(LinkedHashMap<Integer,String> mapa){
        StringBuilder sb = new StringBuilder();
        for (Integer clave : mapa.keySet()){
            sb.append("clave:"+clave).append(" ").append("valor:"+mapa.get(clave)).append("\n");
        }
        return sb.toString();
    }

    private static String mostrarMapa2(LinkedHashMap<Integer,String> mapa){
        return mapa.toString();
    }
}
