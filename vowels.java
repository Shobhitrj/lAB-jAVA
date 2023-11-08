import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Vowels =0,conso=0;
        String s =" He is Ram ";
        int  n =s.length();
        for (int i = 0 ;i<n; i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'q' || s.charAt(i)=='e'||s.charAt(i)=='0'|| s.charAt(i)=='u') {
                Vowels ++;

            } else if (s.charAt(i)==' ') {
                continue;

            }
            else { conso ++;}
            System.out.println("Vowels="+"Vowels"+"Components"+conso);

        }



    }
}
