public class Employee {
    public Employee(){
    System.out.println("I am simple constructor");
}
    public Employee(String name, int id){
        System.out.println("I  have 2 parameters");
    }
    public Employee(String name, int id, String address)
    {
        System.out.println("I have 3 parameters");
    }
    public static void main(String [] args){
        Employee employee1=new Employee();
        Employee employee2=new Employee("Kanta",1);
        Employee employee3=new Employee("Khairul",2,"abc street");

    }
}
