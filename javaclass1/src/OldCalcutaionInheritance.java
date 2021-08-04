public class OldCalcutaionInheritance {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

    class NewCalcutaionInheritance extends OldCalcutaionInheritance {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        NewCalcutaionInheritance demo = new NewCalcutaionInheritance();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
}}
