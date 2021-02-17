package com.introductiontojava2;

abstract class Books{
    abstract void addBook();
    abstract void viewBook();
    abstract void issueBook();
}
interface Fine{
    void finedBooks();
    void issueDate();
    void calculateFine();
}
class Teacher extends Books implements Fine{
    public void addBook(){
        System.out.println("New book is added named life is what you make it");
    }
    public void viewBook(){
        System.out.println("Books available for issuing is life is what you make it");
    }
    public void issueBook(){
        System.out.println("Modify book details");
    }
    public void finedBooks(){
        System.out.println("Enter book name on which fine needs to generated");
    }
    public void issueDate(){
        System.out.println("Date of issued book");
    }
    public void calculateFine() {
        System.out.println("Calculating fine");
    }
}
class Student{
    public void requestBook() {
        System.out.println("Calculating fine");
    }
    public void issuedBooks() {
        System.out.println("Issued books are");
    }
    public void totalFine() {
        System.out.println("total pending fine");
    }
    public void returnBookDates() {
        System.out.println("books return dates");
    }
}

public class ques1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Student s1 = new Student();
        t1.addBook();
        t1.viewBook();
        t1.finedBooks();
        t1.issueBook();
        System.out.println("======= student =========");
        s1.issuedBooks();
        s1.requestBook();
        s1.totalFine();
    }
}