package array;

import java.util.Scanner;

public class ConvertingNumberToWords {
    //iam "declaring" public static so i can call them{array[units]} without creating object
    public static final String[] units = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine","ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };   //array position corresponding to number (0-19)
    public static final String[] tens = {
            "",             //0
            "",             //1
            "Twenty",       //2     //20,30,40,...90 these are unique word
            "Thirty",       //3
            "Forty",        //4
            "Fifty" ,       //5
            "Sixty"  ,      //6
            "Seventy" ,     //7
            "Eighty" ,      //8
            "Ninety",       //9
    };

    public static String convert (final int n) {
       // System.out.println("n = " + n);

        if (n < 0) {//in return your output store in concat format, it is returned when number has been converted
            return "Minus" + convert(-n);
        }
        if (n < 20) {
            return units[n];// units is the array

        }
        if (n < 100) {//[43/10 is Forty so 4 in the tens] + (add space) + remainder is 3 in units[array]
            return tens[n / 10] + ((n % 10 != 0) ? "" : "") + units[n % 10];
                                //Ternary operator ((n%10 !=0)?"":"") is used to add space b/w words a>b?c:d
        }
        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? "" : "") + convert(n % 100);
        }
        if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? "" : "") + convert(n % 1000);
        }
        if (n < 1000000) {
            return convert(n / 100000) + " Hundred Thousand" + ((n % 100000 != 0) ? "" : "") + convert(n % 100000);
        }
        return null;
    }
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to convert into word format");
        n =s.nextInt();
        System.out.println(convert(n));
    }
}
