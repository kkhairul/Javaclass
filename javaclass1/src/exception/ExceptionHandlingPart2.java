package exception;

public class ExceptionHandlingPart2 {
    public static void main(String[] args) {
        try {
            int i=7;
            int j=0;
            int k= i/j;
            System.out.println("output is " + k);

        }
        catch (ArithmeticException e)
        {
            System.out.println(" Error");
        }
        System.out.println("Bye");
    }
}

