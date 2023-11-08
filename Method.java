// q. Wrtie a java program to use the string method




import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         String s= "Hello world ";
         String s1= s.toLowerCase();
         String s2= s.toUpperCase();
         char ch = s.charAt(1);
         String s3= s.concat(s1);
         String s4 = s.substring(1,5);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
