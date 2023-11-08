import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Addition ");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication ");
        System.out.println("4 Division ");;
        System.out.println("PLZ ENTER YOUR CHOICE ");


        int c= sc.nextInt();
        int x= 5,y=3,z;
        switch (c){
            case 1: z = x+y;
                System.out.println("Addition "+ z);
                break;
            case 2: z = x-y;
                System.out.println("SUbtraction "+ z);
                break;
            case 3: z= x*y;
                System.out.println("Multiply "+ z);
                break;
            case 4: z= x/y;
                System.out.println("Division "+ z);
                break;
        }


    }

    
}
