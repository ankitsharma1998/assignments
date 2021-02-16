public class ques4 {
    public void charPercent(String str){
        int totalChars = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChar = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialChar++;
            }

        }
        double upperCaseLetterPercentage = (upperCase * 100) / totalChars;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChars;
        double digitsPercentage = (digits * 100) / totalChars;
        double specialCharPercentage = (specialChar * 100) / totalChars;
        System.out.println("uppercase character percentage is: " + upperCaseLetterPercentage);
        System.out.println("lowercase character percentage is: " + lowerCaseLetterPercentage);
        System.out.println("digits percentage is: " + digitsPercentage);
        System.out.println("special character percentage is: " + specialCharPercentage);
    }
    public static void main(String[] args) {
        ques4 ab = new ques4();
        ab.charPercent("This Is A Char string @56 is my LUcky Num");
    }
}
