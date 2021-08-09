public class Person {int id;
    String name;
    public Person(int i,String n){
        id=i;
        name=n;
    }
}
class Employee extends Person{
    int salary;

    Employee(int i, String n, int s){
        super(i,n);
        salary=s;
    }
    public void print(){
        System.out.println("name of person is" +name+" id of person is"+id+"salary of person is "+salary);
    }
    public static void main(String []args){
        Person e=new Person(1,"Kanta",5);
        e.printinfo();
    }






}
