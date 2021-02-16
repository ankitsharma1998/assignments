public class ques2 {
    public static void main(String[]args)
    {
        String str = "every day is a working day until its a holiday";
        str = str.toLowerCase();
        String words[] = str.split(" ");

        for(int i=0; i<words.length; i++){
            int count = 1;
            for (int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0"){
                System.out.println(words[i] + ": " + count);
            }
        }
    }
}
