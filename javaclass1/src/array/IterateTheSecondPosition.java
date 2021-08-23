package javabasic.array;





import java.util.ArrayList;
import java.util.Iterator;


public class IterateTheSecondPosition {
    public static void main(String[] args) {
        //creat list string name
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("khanth");
        listString.add("Hamza");
        listString.add("Danish");
        listString.add("khairul");
        //print list
        System.out.println(listString);
        //set iterator
        Iterator name = listString.listIterator(1);
        //print The Second Position
        while (name.hasNext()){
            System.out.println(name.next());


    }
    }


}
