package estructurasDatos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**  DEQUE
 *   Es una cola de doble final . La cola se puede recorrer desde el principio o desde el final
 * */
public class Bicola {
    public static void main(String[] args) {
        Deque<Integer> bicola =  new ArrayDeque<>();
        // Añade al final de la bicola
        bicola.add(4);
        bicola.add(5);
        bicola.add(6);

        // Añade al inicio de la bicola
        bicola.addFirst(3);
        bicola.addFirst(2);
        bicola.push(1);


        // Añade al final de la bicola
        bicola.addLast(7);
        bicola.addLast(8);

        System.out.println(bicola);

        int primerElem = bicola.removeFirst();
        System.out.println("eliminado primer elemento:"+primerElem);

        int ultimoElem = bicola.removeLast();
        System.out.println("eliminado ultimo elemento:"+ultimoElem);

        Iterator<Integer> iterator = bicola.iterator();
        while (iterator.hasNext()){
            int num = Integer.parseInt(String.valueOf(iterator.next()));
            if (num%2==0){
                System.out.print(num+" ");
            }
        }

    }
}
