
package constructors;
public class ComplexNumberPart1 {
    //Addition of Complex Number

    //local variables
    float real, img;

    //constructor
    ComplexNumberPart1(float r, float i)
    //i is imaginary number and r number
    {
        //constructor looks for constructor with parameter
        //local variables
        real = r;
        img = i;
    }

    ComplexNumberPart1() {

    }
    // using local variables to print values
    //creat a method in ComplexNumberPart1
    void display()
    {
        System.out.println(real + "+ i"+img);
    }
    //addition
    ComplexNumberPart1 add(ComplexNumberPart1 ComplexNumber2)
        //class method (class object)
    {
        //object pasing two type class
        ComplexNumberPart1 res = new ComplexNumberPart1();
        res.real = real + ComplexNumber2.real;     //to call obj ComplexNumber1
        res.img = img + ComplexNumber2.img;

        return(res); //store inside ComplexNumber3 (.add)
    }
    //Subtraction
    ComplexNumberPart1 sub(ComplexNumberPart1 ComplexNumber2)
    {
        //object pasing two type class
        ComplexNumberPart1 res = new ComplexNumberPart1();
        res.real = real - ComplexNumber2.real;     //to call obj ComplexNumber1
        res.img = img - ComplexNumber2.img;

        return(res); //store inside ComplexNumber3 (.add)
    }
}
     class calc{
         public static void main(String[] args) {
             //two boject ComplexNumberPart1 class
             ComplexNumberPart1 ComplexNumber1 = new ComplexNumberPart1(12.5f,2.5f);//12.5f f is a floating
             ComplexNumberPart1 ComplexNumber2 = new ComplexNumberPart1(09.5f, 0.5f);

             System.out.println("ComplexNumber1 is: ");
             ComplexNumber1.display();
             System.out.println("ComplexNumber2 is: ");
             ComplexNumber2.display();
             //begins calcutation
             // store the result of addition
             ComplexNumberPart1 ComplexNumber3 = new ComplexNumberPart1();
             ComplexNumber3 = ComplexNumber1.add(ComplexNumber2);//return value so return type is class (ComplexNumberPart1)
             System.out.println("Additon of ComplexNumber1 and ComplexNumber2 is:  ");
             ComplexNumber3.display();
             //Subtraction
             ComplexNumber3 = ComplexNumber1.sub(ComplexNumber2);
             System.out.println("Subtraction of ComplexNumber1 and ComplexNumber2 is: ");
             ComplexNumber3.display();
         }
     }









