
public class ques7 {
    static String firstName = "Ankit";
    static String lastName = "Sharma";
    static int age  = 23;
    static{
        System.out.println("inside static block=======================");
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
    }
    static void changeName(){
        firstName = "chetan";
        lastName = "goel";
        age  = 23;
    }
    public static void main(String[] args) {
        ques7.changeName();
        System.out.println("inside main block===========================");
        System.out.println("firstName: " +ques7.firstName);
        System.out.println("lastname: " + ques7.lastName);
        System.out.println("age: " + ques7.age);
    }
}
