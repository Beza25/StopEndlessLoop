
import java.io.IOException;
import java.util.Scanner;

public class EndlessStrings {
    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("If you want to stop, write STOP\n");
        System.out.println("Enter a string");
        String userInput = input.nextLine();



        while(userInput != " "){
            if (userInput.equalsIgnoreCase("STOP")){
                break;
            }else{
                System.out.println(userInput);
            }
            System.out.println("Enter another string");
            userInput = input.nextLine();
        }
        System.out.println("Good Bye!");


    }
}
