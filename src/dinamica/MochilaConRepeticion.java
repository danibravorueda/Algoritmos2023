package dinamica;

import java.util.HashMap;
import java.util.Map;

public class MochilaConRepeticion {
    public static void main(String[] args) {
        int [] valor = {20,5,10,40,15,25};
        int [] peso = {1,2,3,8,7,4};
        int capacidadMax = 10;

        Map<String,Integer> memo =  new HashMap<>();
        System.out.println("valor max en mochila:"+mochila(valor,peso,valor.length-1,capacidadMax,memo));
        System.out.println(memo);
    }

    private static int mochila(int [] valor,int [] peso,int pos,int capacidadMax,Map<String,Integer> memo){
       if (capacidadMax<0){
           return Integer.MIN_VALUE;
       }
       if (pos<0 || capacidadMax==0){
           return 0;
       }

       String clave = pos+":"+capacidadMax;
       if (!memo.containsKey(clave)){
           int incluir = valor[pos] + mochila(valor,peso,pos-1,capacidadMax-peso[pos],memo);
           int excluir = mochila(valor,peso,pos-1,capacidadMax,memo);
           memo.put(clave,Integer.max(incluir,excluir));
       }
        return memo.get(clave);
    }
}
