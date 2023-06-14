package stringMatching;

public class CodigoASCII {
    public static void main(String[] args) {
        String patron = "ABCD";
        int hash = 0;
        for (int pos = 0 ; pos < patron.length() ; ++pos){
            hash += patron.charAt(pos) - 'A';
            System.out.println(hash);
        }
    }
}
