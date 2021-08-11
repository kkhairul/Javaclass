package practice;

public class ReturnType {
    public String firstName;
    public String lastName;

    public String output(){
        return "HI ME NAME IS " + firstName + "" + lastName + ",";
    }
    public static void main(String[] args) {
        ReturnType user = new ReturnType();
        user.firstName = "khairul";
        user.lastName = "Chowdhury";

        String message = user.output();
    }

    }

