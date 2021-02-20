package com.introductiontojava8;
interface Emp{
    Employee emp (String name, int age, String city);
}
class Employee{
    private String name;
    private int age;
    private String city;

    Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public void details(){
        System.out.println("name: " + name + " age: " + age + " city: " + city);
    }
}
public class ques4 {
    public static void main(String[] args) {
        Emp emp1 = Employee::new;
        Employee ep1 = emp1.emp("Ankit", 23,"Delhi");
        ep1.details();
        Employee ep2 = emp1.emp("Abhishek", 28,"prayagraj");
        ep2.details();
        Employee ep3 = emp1.emp("sunny", 22,"kolkata");
        ep2.details();
    }
}
