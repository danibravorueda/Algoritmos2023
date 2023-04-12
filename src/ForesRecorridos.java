public class ForesRecorridos {
    public static void main(String[] args) {
        //primeraPiramideFor();
        //segundaPiramideFor();
        //terceraPiramideFor();
        //cuartaPiramide();
        quintaPiramide();
    }


   /**   SALIDA PIRAMIDE
    *     1 1 1 1 1
    *     2 2 2 2
    *     3 3 3
    *     4 4
    *     5
    *
    * */
    private static void primeraPiramideFor(){
        for (int num = 1 ; num <=5 ; num++){
            for (int sig = num ; sig <=5 ; sig++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    /**  SALIDA PIRAMIDE
     *   1 2 3 4 5
     *   2 3 4 5
     *   3 4 5
     *   4 5
     *   5
     *
     * */

    private static void segundaPiramideFor(){
        for (int num = 1 ; num <=5 ; num++){
            for (int sig = num ; sig <=5 ; sig++){
                System.out.print(sig+" ");
            }
            System.out.println();
        }
    }

    /** SALIDA PIRAMIDE
     *    1
     *    1 2
     *    1 2 3
     *    1 2 3 4
     *    1 2 3 4 5
     *
     * */

    private static void terceraPiramideFor(){
        for (int num = 1 ; num <=5 ; num++){
            for (int sig = 1 ; sig <=num ; sig++){
                System.out.print(sig+" ");
            }
            System.out.println();
        }
    }

    /**  SALIDA  RECORRIDO
     *    1
     *    2 3
     *    4 5 6
     *    7 8 9 10
     * */

    private static void cuartaPiramide(){
        int cont = 1 ;
        for (int pos = 1 ; pos <=4 ; pos++){
            for (int sig = 1 ; sig <= pos ; sig++){
                System.out.print(cont+" ");
                cont++;
            }
            System.out.println();
        }
    }


    /** SALIDA PIRAMIDE
     *    10 9 8 7
     *    6 5 4
     *    3 2
     *    1
     * */

    private static void quintaPiramide(){
        int cont = 10;
        for (int pos = 4 ; pos >=0 ;pos--){
            for (int sig=1 ; sig<=pos ; sig++){
                System.out.print(cont+" ");
                cont--;
            }
            System.out.println();
        }
    }



}
