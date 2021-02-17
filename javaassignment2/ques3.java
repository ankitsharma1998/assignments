package com.introductiontojava2;

class NotFound{ //If this class is removed after compilation then NoClassDefFoundError could be seem.
    public void display(){
        System.out.println("Some random text");
    }
}
public class ques3 {
    public static void main(String[] args) {
        try{
            Class.forName("NoName");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        NotFound nf = new NotFound();
        nf.display();
    }
}

