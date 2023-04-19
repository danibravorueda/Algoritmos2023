package estructurasDatos;
import java.util.PriorityQueue;

/**
 * Cola de Prioridad (Priority Queue)
 * Se agregan elementos a la cola segun su valor y se ingresan de menor a mayor
 *
 * Elimina por Frente
 *
 * */
public class ColaPrioridad {
    public static void main(String[] args) {
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        cola.offer(10);
        cola.offer(3);
        cola.offer(11);
        cola.offer(2);
        cola.offer(5);
        cola.offer(6);
        cola.offer(1);
        cola.offer(7);

        System.out.println(cola.toString());

        System.out.println("se ha eliminado:"+cola.poll());

        //Iterar una Cola de Prioridad
        while (!cola.isEmpty()){
            System.out.print(cola.poll()+" ");
        }
        System.out.println();
    }
}
