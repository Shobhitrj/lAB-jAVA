import java.util.Scanner;

public class gfg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Gfg = "geek for geeks";
        char g = 'g';  // Initialize the character variables
        char e = 'e';
        char k = 'k';

        int G = 0;
        int E = 0;
        int K = 0;

        for (int i = 0; i < Gfg.length(); i++) {
            if (Gfg.charAt(i) == g) {
                G++;
            } else if (Gfg.charAt(i) == e) {
                E++;
            } else if (Gfg.charAt(i) == k) {
                K++;
            }
        }

        System.out.println("G = " + G);
        System.out.println("E = " + E);
        System.out.println("K = " + K);
    }
}
