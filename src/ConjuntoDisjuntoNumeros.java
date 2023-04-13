import java.util.HashMap;
import java.util.Map;

public class ConjuntoDisjuntoNumeros {
    public static void main(String[] args) {
        int [] universo = {1,2,3,4,5};
        DisjointSet ds = new DisjointSet();
        // crea un singleton para cada elemento del universo
        ds.makeSet(universo);
        //printSets(universo,ds);

        ds.Union(4,3); // a quiere ser amigo de b
       printSets(universo,ds);

//        ds.Union(2,1);
//        printSets(universo,ds);
//
//        ds.Union(1,3);
//        printSets(universo,ds);
    }

    private static void printSets(int [] universo,DisjointSet ds){
        for(int elem : universo){
            System.out.print(ds.Find(elem)+" ");
        }
        System.out.println();
    }


    static class DisjointSet{
        private Map<Integer,Integer> padres = new HashMap<>();

        /** Realiza operaciones MakeSet **/
        public void makeSet(int [] universo){
            for (int elem : universo){
                padres.put(elem,elem);
            }
        }

        /** Encuentra raiz del conjunto al que pertenece el elemento **/
        public int Find(int clave){
            if (padres.get(clave)==clave){
                return clave;
            }
            return Find(padres.get(clave)); // recorre al padre hasta llegar a la raiz
        }

        /** une dos subconjuntos   **/
        public void Union(int a,int b){
            // encontrar la raiz de los conjuntos a los que pertenecen x e y
             int x = Find(a);
             int y = Find(b);
             padres.put(x,y);
        }
    }
}
