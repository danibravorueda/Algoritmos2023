package dinamica;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8 ;
        Map<Integer,Integer> memo =  new HashMap<>();
        System.out.println(obtenerFibonacci(n,memo));
    }

    private static int obtenerFibonacci(int n , Map<Integer,Integer> memo){
        if (n<=1){
            return n;
        }

        if (!memo.containsKey(n)){
            int valor =obtenerFibonacci(n-1,memo)+obtenerFibonacci(n-2,memo);
            memo.put(n,valor);
        }

        return memo.get(n);
    }
    private static int obtenerFibonacci2(int n , Map<Integer,Integer> memo){
        if (n<=1){
            return n;
        }
        if (memo.containsKey(n)){
           return memo.get(n) + obtenerFibonacci2(1,memo);
        }else{
            return obtenerFibonacci2(n-1,memo)+obtenerFibonacci2(n-2,memo);
        }
    }
}
