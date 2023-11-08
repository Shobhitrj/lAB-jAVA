import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence = "This is sentence with ";

        String[] word = sentence.split(" ");
        int count = 0 ;
        int wordcount = word.length;;
        for (int i=0;i<word.length;i++){
            for (int j =0 ; j<word.length;j++){
                if(word[i].equals(word[j])){


                    count++;
                    break;
                }

            }
        }
        System.out.println("words="+ wordcount);
        System.out.println("duplicate words ="+ count);

    }
}
