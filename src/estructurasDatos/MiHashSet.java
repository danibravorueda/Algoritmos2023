package estructurasDatos;

import java.util.HashSet;
import java.util.Iterator;

/**
 *  No permite elementos repetidos
 *  Los elementos se insertan de forma desordenada y en funcion a su codigo hash
 */

public class MiHashSet {
    public static void main(String[] args) {
        HashSet<String> map =  new HashSet<>();

        System.out.println("----------------------------------------\n");
        anadirElementos(map);
        System.out.println("Mostrar elementos de mapa:\n"+mostrarMapa3(map));

        System.out.println("----------------------------------------\n");
        System.out.println("Se pudo eliminar ?"+eliminarElementos(map));
        System.out.println(mostrarMapa(map));

        System.out.println("----------------------------------------\n");
        System.out.println("contiene el elemento:"+contieneElemento(map));

        System.out.println("----------------------------------------\n");
        System.out.println("tamanio de Mapa:"+tamanioMapa(map));

        System.out.println("----------------------------------------\n");
        System.out.println("El Mapa es vacio:"+esVacioMapa(map));
    }


    private static boolean esVacioMapa(HashSet<String> map){
        return map.isEmpty();
    }

    private static int tamanioMapa(HashSet<String> map){
        return map.size();
    }

    private static boolean contieneElemento(HashSet<String> map){
        return map.contains("maria");
    }

    private static boolean eliminarElementos(HashSet<String> map){
        return map.remove("dani"); // devuelve boolean
    }

    private static void anadirElementos(HashSet<String> map){
        map.add("ana");
        map.add("carla");
        map.add("bertha");
        map.add("dani");
        map.add("elmer");
        map.add("maria");
    }

    private static String mostrarMapa(HashSet<String> map){ // iterar mapa 1
        StringBuilder res = new StringBuilder();
        Iterator<String> lista= map.iterator();
        while (lista.hasNext()){
            res.append(lista.next()).append(" ");
        }
        return res.toString();

    }

    private static String mostrarMapa3(HashSet<String> map){ // iterar mapa 2
        StringBuilder sb = new StringBuilder();
        for (String elem : map){
            sb.append(elem).append(" ");
        }
        return sb.toString();
    }

    private static String mostrarMapa2(HashSet<String> map){ // [bertha, elmer, ana, dani, carla, maria]
        return map.toString();
    }
}
