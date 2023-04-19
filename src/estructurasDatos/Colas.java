package estructurasDatos;

import java.util.LinkedList;
import java.util.Queue;

/** Cola (Queue)   => Primero en entrar es el primero en salir
 *    insertar - encolar (enqueue): insercion por fin de la cola
 *    eliminar - desencolar (dequeue) : eliminacion por frente de la cola
 *
 *     LinkedList : es una lista enlazada si o si usar para crear una cola
 * */
public class Colas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Insertar Elementos al Final de la Cola
        cola.offer(4);
        cola.offer(6);
        cola.offer(2);
        cola.offer(3);
        cola.offer(9);
        System.out.println(cola.toString());

        // Eliminamos Elementos al Inicio de la Cola
        System.out.println("eliminado elemento:"+cola.poll());
        System.out.println(cola.toString());

        // Consultamos el elemento desde el Inicio de la Cola y sin eliminarlo
        System.out.println("consulta:"+cola.peek());
        System.out.println(cola.toString());

        // Obtener tamanio de Cola
        System.out.println("tamanio:"+cola.size());

        // Iterar la Cola
        System.out.println("Iterar Cola:");
        while (!cola.isEmpty()){
            System.out.print(cola.poll()+" "); // si o si poll porq sinos da infinito
        }
        System.out.println();

        // Borrar contenido Cola
        System.out.println("Borrar Cola:");
        cola.clear();
        System.out.println(cola.toString());

    }
}
