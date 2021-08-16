package constructors;

public class ComplexNumber {private double  re, im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    //copy constructor
    ComplexNumber(ComplexNumber c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }
    //Overrding the toString of Object class
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

    class CopyConstructor {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(10, 20);

        // Following involves a copy constructor call
        ComplexNumber c2 = new ComplexNumber(c1);

        ComplexNumber c3 = c2;
        System.out.println(c2);
    }
}
