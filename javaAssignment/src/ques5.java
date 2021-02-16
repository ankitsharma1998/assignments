import java.util.HashSet;
import java.util.Set;

public class ques5 {
    public void findCommon(String[] str1, String[] str2){
        Set<String> commonWords = new HashSet<>();
        for (String value : str1) {
            for (String s : str2) {
                if (value.equals(s)) {
                    commonWords.add(value);
                    break;
                }
            }
        }
        System.out.println("Common elements are: ");
        for(String i:commonWords) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ques5 common = new ques5();
        String[] st1 = {"this", "is", "my", "first", "string"};
        String[] st2 = {"this", "is", "my", "second", "string"};
        common.findCommon(st1, st2);
    }
}