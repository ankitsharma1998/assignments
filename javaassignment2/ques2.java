package com.introductiontojava2;
public class ques2 {
    public static void main(String[] args) {
        String str  = "zxywvutsrqponmlkjihgfedcba";
        System.out.println("String before sorting: " + str);
        char temp = 0;
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<chars.length;j++){
                if(chars[i] < chars[j]){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.print("After sorting: ");
        for (int i=0;i< chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
