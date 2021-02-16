public class ques8 {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("On this string mutation will occur");
            sb.reverse();
            System.out.println("string is reversed: " + sb.toString());
            sb.delete(4, 9);
            System.out.println("string characters are removed from 4 to 9: " + sb.toString());
        }
    }

