package stringMatching;


/**
 *    Input   :  "AABACACAACAC"
 *    Patron :  "CAC"
 *    Output  :  [4,9]
 *
 *
 * */
public class RabinKarp {
    public static void main(String[] args) {
        String texto = "AABAACAADAABAABA";
        String patron = "AABA";
        search(texto, patron);
    }

    static void search(String texto, String patron) {
        int hash1 = 0;
        int hash2 = 0;
        for (int i = 0; i < patron.length(); ++i) {
            hash1 += patron.charAt(i) - 'A';
            hash2 += texto.charAt(i) - 'A';
        }

        int j = 0;
        for (int i = 0; i <= texto.length() - patron.length(); ++i) {
            if (hash2 == hash1) {
                for (j = 0; j < patron.length(); ++j) {
                    if (patron.charAt(j) != texto.charAt(i + j)) {
                        break;
                    }
                }
            }

            if (j == patron.length()) {
                System.out.println(i);
            }

            if (i == texto.length() - patron.length())
                break;

            hash2 = (int) ((hash2) - (texto.charAt(i) - 'A')) + texto.charAt(i + patron.length()) - 'A';
        }
    }
}