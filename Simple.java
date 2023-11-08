import java.util.HashMap;
import java.util.Locale;

public class Simple {
    public static void main(String[] args) {
        System.out.println("");

        String s = "Hello";
        String s2 = "hello";

        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(4));//...........>>>>>> unicode point at

        System.out.println(s.codePointBefore(4)); // .................>>>
        System.out.println(s.toLowerCase());
        System.out.println(s.compareTo(s2));





    }
}
