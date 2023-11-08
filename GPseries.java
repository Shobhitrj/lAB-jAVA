import java.util.Scanner;

public class GPseries {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter common ration:");
        int r = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the no. of terms in series");
        int n = sc.nextInt();
        for(int i = 1;i <=n;i++){
            sum = sum+a;
            a= a*r;
        }
        System.out.println("Sum of series:"+sum);

    }

}
