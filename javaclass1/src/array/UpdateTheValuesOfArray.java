package javabasic.array;
import java.util.*;

public class UpdateTheValuesOfArray {
    public static void main(String[] args) {
        //creat list string name
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("khanth");
        listString.add("Hamza");
        listString.add("Danish");
        listString.add("UNKNOWN");
        listString.add("Jadid");
        listString.add("Nouman");
        listString.add("REZIA");

        //remove
        listString.remove("UNKNOWN");
        //print list
        System.out.println(listString);
        //false sing is not in the listString
        System.out.println( listString.contains("sing"));
        //update

        listString.set(0,"khairul");
        System.out.println(listString);
        Iterator name = listString.listIterator(1);
        //print The Second Position
        while (name.hasNext()){
            System.out.println(name.next());
            //just array

        }
        {
            String[] fruits  = new String[5];
            fruits[0] = "Mango";
            fruits[1] ="Grapes";
            fruits[2] ="Apple";
            fruits[3] ="Coconut";
            fruits[4] ="Dates";

            System.out.println("Fruit name is " + fruits[4]);
        }
    }}
