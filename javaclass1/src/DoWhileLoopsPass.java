import java.util.Scanner;

public class DoWhileLoopsPass {


    public static void main (String [] args){
        //int i = 1;{
          //  do {
            //    System.out.println("hello" + 1);
              //  i++;
            //} while (i <=3);
        String password = "let me in";
        Scanner scanner = new Scanner(System.in);
        String guss;
        do {
            System.out.println("Guess the password:");
            guss = scanner.nextLine();
        } while (!guss.equals(password));
        System.out.println("congrats");
        scanner.close();

}}
