package exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int i = 9/0;

        }
        catch (Exception e)
        {
            System.out.println(" Error");
        }
        System.out.println("Bye");
    }
}
