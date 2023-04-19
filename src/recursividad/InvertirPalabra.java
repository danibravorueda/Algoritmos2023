package recursividad;

public class InvertirPalabra {
    public static void main(String[] args) {
        System.out.println(invertirPalabra("Daniela"));
    }

    private static String invertirPalabra(String palabra){
        return invertir(palabra.length()-1 , palabra);
    }

    private static String invertir(int posFin , String palabra){
       if (posFin==0){
           return palabra.charAt(posFin)+"";
       }else{
           return palabra.charAt(posFin)+invertir(posFin-1 , palabra);
       }
    }
}
