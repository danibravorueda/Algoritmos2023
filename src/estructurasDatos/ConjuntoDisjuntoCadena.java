package estructurasDatos;

import java.util.HashMap;
import java.util.Map;


/**
 *  Amigos cercanos
 *
 * */

public class ConjuntoDisjuntoCadena {
    public static void main(String[] args) {
        String [] universo = {"dani","carly","luis","fabi","oscar"};
        // dani : carly
        // fabi : oscar , luis

        SetDisjoint sd = new SetDisjoint();
        sd.makeSet(universo);

        sd.Union("carly","dani"); // carly sera amiga de dani(principal)
        //printSets(universo,sd);

        sd.Union("oscar","fabi"); // oscar sera amigo de fabi(principal)
       // printSets(universo,sd);

        sd.Union("luis","fabi");
        //printSets(universo,sd);

//        sd.imprimirHashMap();

        // mostrar los amigos de fabi
        System.out.println(sd.obtenerAmigosDe("fabi"));
        // mostrar los amigos de dani
        System.out.println(sd.obtenerAmigosDe("dani"));
    }

    private static void printSets(String  [] universo, SetDisjoint ds){
        for(String elem : universo){
            System.out.print(ds.Find(elem)+" ");
        }
        System.out.println();
    }

    static class SetDisjoint{

        private Map<String,String> padres = new HashMap<>();

        public void makeSet(String [] universo){
            for (String elem : universo){
                padres.put(elem,elem);
            }
        }

        public String Find(String clave){
            if (padres.get(clave).equals(clave)){
                return clave;
            }
            return Find(padres.get(clave));
        }


        public void Union(String a,String b){
            String x = Find(a);
            String y = Find(b);
            padres.put(x,y);
        }

        public String obtenerAmigosDe(String clave){
            String res = "";
            for (String claveMap : padres.keySet()){
                if (!claveMap.equals(padres.get(claveMap))){
                    if (padres.get(claveMap).equals(clave)){
                        res+=claveMap+" " ; // obtener clave
                    }
                }
            }
            return res;
        }

//        public void imprimirHashMap(){
//            for (String clave : padres.keySet()) {
//                System.out.print(clave+" "+padres.get(clave)+"\n");
//            }
//        }

    }
}
