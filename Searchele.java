import java.util.Scanner;

public class Searchele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Element of array ");
        for (int i = 0; i<5;i++){
            System.out.println("Enter element "+i+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the ELement to search ");
        int s=sc.nextInt();
        for(int j =0 ; j<5;j++){
            if(arr[j]==s){
                System.out.println("Element found at "+ j+"indec");

            }
            else{
                System.out.println("Elemnt Not found ");
                break;


            }
        }
    }
}
