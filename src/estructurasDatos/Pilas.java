package estructurasDatos;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // insertar elementos en la pila
        pila.push(3);
        pila.push(5);
        pila.push(2);
        pila.push(4);
        System.out.println(pila.toString());

        // consultar tamanio pila
        System.out.println("tamanio:"+pila.size());

        //Eliminar valor
        System.out.println("Se ha eliminado:"+pila.pop());
        System.out.println(pila.toString());

        //Consultar Elemento en la cola sin eliminarlo
        System.out.println("consulta:"+pila.peek());

        while (!pila.isEmpty()){
            System.out.print(pila.pop()+" ");
        }
        System.out.println();
    }
}
