import java.util.Scanner;

public class Addmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar3 = new int[2][2];
        int[][] ar1 = new int[2][2];
        int[][] ar2 = new int[2][2];

        System.out.println("Enter first array element ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ar1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd Array element ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ar2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ar3[i][j] = ar1[i][j] + ar2[i][j];
            }
        }

        System.out.println("Sum of Matrices ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(ar3[i][j]);
                System.out.println();
            }

        }


    }
}
