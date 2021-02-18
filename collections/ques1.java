package com.introductiontocollections;
import java.util.ArrayList;
import java.util.Iterator;

public class ques1 {
    public static void main(String[] args)
    {   //created an ArrayList and added objects of type float into it
        ArrayList floatList= new ArrayList<Float>();
        floatList.add(9.7f);
        floatList.add(7.4f);
        floatList.add(6.8f);
        floatList.add(5.4f);
        floatList.add(2.1f);

        //creating iterator object to iterate through list
        Iterator iterate = floatList.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next()); //printing objects in ArrayList
        }
    }
}

