package segundoParcial;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecuenciaOndulante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw  = new PrintWriter(System.out);
        int n = sc.nextInt();
        int [] lista =  new int[n];
        for(int pos = 0 ; pos < lista.length;pos++){
            lista[pos] = sc.nextInt();
        }
        pw.println(obtenerMaximaSubsecuencia(n,lista));
        pw.close();
    }

    private static int obtenerMaximaSubsecuencia(int n , int [] lista){
        List<Integer> subsecuencia = new ArrayList<>();
        if (validar(n,lista)){
            if (n==0){
                return 0 ;
            }
            else if (n==1){
                return 1;
            }
            else{

                subsecuencia.add(lista[0]);
                for (int pos= 1 ; pos<n; pos++){
                    if ((subsecuencia.size() % 2==1) && (lista[pos]<subsecuencia.get(subsecuencia.size()-1)) || (subsecuencia.size()%2==0) && (lista[pos]>subsecuencia.get(subsecuencia.size()-1))){
                      subsecuencia.add(lista[pos]);
                    }else{
                        subsecuencia.set(subsecuencia.size()-1,lista[pos]);
                    }
                }
            }
        }
        return subsecuencia.size();
    }

    private static boolean validar(int n , int [] lista){
        boolean bandera1 = false;
        boolean bandera2 = false;
        if(n>=1 && n<=500) {
            bandera1 = true;
        }

        for (int elem:lista){
            if (elem>=(int)Math.pow(-10,9) && elem<=(int)Math.pow(10,9) && lista.length == n){
                bandera2 = true;
            }
        }

        if (bandera1 && bandera2){
            return true;
        }else{
            return false;
        }
    }
}
