public class ques10 {
    //Adding 2 integer number
    static int add(int num1,int num2)
    {
        return  num1+num2;
    }
    //Adding 2 double
    static double add(double num1, double num2)
    {
        return num1+num2;
    }

    // multiplying 2 float
    static float multiply(float num1, float num2)
    {
        return num1*num2;
    }
    // multiplying 2 int
    static int multiply(int num1, int num2)
    {
        return num1*num2;
    }

    // concate 2 string
    static String concat(String str1, String str2)
    {
        return str1+str2;
    }
    // Concate 3 String
    static String concat(String str1, String str2, String str3)
    {
        return str1+str2+str3;
    }

    public static void main(String[] args) {

        System.out.println("Adding 2 integers: 67 + 78 = "+ques10.add(67,78));
        System.out.println("Adding 2 doubles: 689.987 + 7877.9876 = "+ques10.add(689.987,7877.9876));

        System.out.println("Multiplying 2 floats: 66.6 * 78.7 = "+ques10.multiply(66.6f,78.7f));
        System.out.println("Multiplying 2 integers: 50 * 40 = "+ques10.multiply(50,40));

        System.out.println("Concatenate 2 strings: 'ankit' , 'sharma' = "+ques10.concat("ankit"," sharma"));
        System.out.println("Concatenate 3 strings: 'hello' , 'ankit' , 'sharma' = "+ques10.concat("hello"," ankit"," sharma"));
    }
}
