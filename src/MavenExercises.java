import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Checks for a number
//        System.out.println("please enter a number:");
//        String userInput = sc.nextLine();
//
//        if (StringUtils.isNumeric(userInput)){
//            System.out.println("true");
//        }else{
//            System.out.println("Not a Number.");
//        }

//        REVERSE CASE

//        System.out.println("Enter a word:");
//        String userWord = sc.nextLine();
//
//        String reverseCase = StringUtils.swapCase(userWord);
//        System.out.println(reverseCase);

        System.out.println("Enter a word:");
        String reverseWord = sc.nextLine();

        String reverse = StringUtils.reverse(reverseWord);
        System.out.println(reverse);
    }
}
