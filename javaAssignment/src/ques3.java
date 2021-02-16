public class ques3 {
    public static void main(String[]args)
    {
        String str = "number of occurrences of a character in a string without using loop";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("a letter is repeated " + count + " times");
    }
}
