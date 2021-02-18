package com.introductiontocollections;
import java.util.HashMap;

public class ques3 {
    public void countRepitation(String st){
        HashMap<Character, Integer> countOccurrences = new HashMap();
        char[] strArray = st.toCharArray();
        for(char c:strArray){
            if(countOccurrences.containsKey(c)){
                countOccurrences.put(c, countOccurrences.get(c) + 1);
            }else{
                countOccurrences.put(c, 1);
            }
        }
        countOccurrences.forEach((key,val)-> System.out.println("Char: "+key +" "+"Occurances: "+val));
    }
    public static void main(String[] args) {
        String st = "this is a repeated sting which will give repeatd character";
        ques3 cr = new ques3();
        cr.countRepitation(st);
    }
}
