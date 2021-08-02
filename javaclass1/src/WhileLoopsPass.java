import java.util.Scanner;

public class WhileLoopsPass {
    public static void main (String [] args){
     /*
     *
     * initialization
     * comparison
     * update
     *
      */
       // int i = 1;
        //while (i <10 ){
          //  System.out.println("hello world"); i++;
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
