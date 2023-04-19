package estructurasDatos;

import java.util.TreeMap;

/***
 *  TreeMap (Arbol Rojo - Negro)
 *  Un tipo de arbol binario de busqueda equilibrada y se agrega un bit adicional a cada nodo que
 *  etiqueta como negro o rojo
 *
 *  - Es una coleccion que almacena pares claves-valor en un orden ordenado
 *   - TreeMap no permite elementos repetidos
 *  - permite valores nulos pero no claves nulas
 */
public class MiTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> lista =  new TreeMap<>();

        // add valores
        lista.put(2,"Dani");
        lista.put(3,"maria");
        lista.put(5,"rose");

        lista.put(2,"Dani");

        System.out.println(lista.toString());

        // Contiene Valor
        System.out.println("contiene valor:"+ lista.containsValue("Dani"));

        // COntiene Clave
        System.out.println("contiene clave:"+ lista.containsKey(8));

        //Obtener clave del primer elemento
        System.out.println("primera clave:"+lista.firstKey());

        // Obtener clave del ultimo elemento
        System.out.println("ultima clave:"+lista.lastKey());

        //Iterar TreeMap
        for (int elem : lista.keySet()){
            System.out.print("clave:"+elem+" "+"valor:"+lista.get(elem)+"\n");
        }

        //Eliminar por clave , retorna el Valor
        System.out.println("eliminar la  clave:"+lista.remove(5));


    }
}
