import java.util.Scanner;

public class WhileLoopsPass {
    public static void main (String [] args){
   
        System.out.println("Guess the password:");
        String password = "let me in";
        Scanner scanner = new Scanner(System.in);
        String guss = scanner.nextLine();

        while(!guss.equals(password) )
        {
            System.out.println("Guess the password:");
            guss = scanner.nextLine();
        }
        System.out.println("congrats");
    }
}
