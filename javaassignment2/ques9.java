package com.introductiontojava2;

interface Furniture{
    public void stressTest();
    public void fireTest();
}
abstract class Chair implements Furniture{
    abstract String chairType();
}
abstract class Table implements Furniture{
    abstract String tableType();
}
class MetalChair extends Chair{
    public void stressTest(){
        System.out.println("Test passed");
    }
    public void fireTest(){
        System.out.println("Test passed");
    }
    public String chairType(){
        return "MetalChair";
    }
}
class WoodenChair extends Chair{
    public void stressTest(){
        System.out.println("Test passed");
    }
    public void fireTest(){
        System.out.println("Test passed");
    }
    public String chairType(){
        return "WoodenChair";
    }
}
class MetalTable extends Table {
    public void stressTest() {
        System.out.println("Test passed");
    }

    public void fireTest() {
        System.out.println("Test passed");
    }

    public String tableType() {
        return "MetalTable";
    }
}
class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Test passed");
    }

    public void fireTest() {
        System.out.println("Test passed");
    }

    public String tableType() {
        return "WoodenTable";
    }
}
public class ques9 {
    public static void main(String[] args)
    {
        WoodenChair ch = new WoodenChair();
        System.out.println(ch.chairType());
        ch.fireTest();
        ch.stressTest();

        MetalChair mt = new MetalChair();
        System.out.println(mt.chairType());
        mt.fireTest();
        mt.stressTest();
    }
}