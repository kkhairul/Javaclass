package exception;

public class Finally {
    public static void main(String[] args) {
        try {
            int i = 7;
            int j = 2;
            int k = i / j;
            System.out.println("output is " + k);

        } catch (ArithmeticException e) {
            System.out.println(" Error");
        } finally {

            System.out.println("Bye");
        }
    }
}