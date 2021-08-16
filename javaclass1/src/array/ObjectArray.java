package array;
class Monkey {
    String type = "Spider monkey";
    public static void  sayOoAhhAhh(){
        System.out.println("say Oo Ahh Ahh");
    }
    public static void  monkeysJump(){
        System.out.println("monkeys1 Jump and say Oo Ahh Ahh ");
    }
    public static void  monkeysEat() {
        System.out.println("monkeys2 eat bananas  ");
    }
    public static void  monkeysWalk() {
        System.out.println("monkeys3 walk upright as they climb trees and scale cliff faces ");
    }
    public static void  monkeysSleep() {
        System.out.println(" all monkeys  sleep sitting in the trees, balancing on a branch, often upright ");
    }

}
public class ObjectArray {
    public static void main(String[] args) {
        Monkey m1= new Monkey();
        Monkey m2= new Monkey();
        Monkey m3= new Monkey();

        // Obj[] myObjArray = {01, 02};
        Monkey[] monkeys = {m1,m2,m3};
        int [] num = {1,4,5};
        for (Monkey m : monkeys){
            m.sayOoAhhAhh();
        }
        Monkey[] monkeys1 = {m1};
        int [] num1 = {1};{
            m1.monkeysJump();
        }


        Monkey[] monkeys2 = {m1,m2,m3};
        int [] num2 = {1,4,5};
        for (Monkey m : monkeys){
            m1.monkeysEat();

        }
        Monkey[] monkeys3 = {m3};
        {
            m3.monkeysWalk();
        }
        Monkey[] monkeys4 = {m1,m2,m3};
        int [] num4 = {1,4,5};
        for (Monkey m : monkeys){
                m1.monkeysSleep();



}}}
