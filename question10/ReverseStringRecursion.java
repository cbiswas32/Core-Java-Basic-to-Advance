package question10;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        String str = "abcde";
        System.out.print(reverse(str));

    }

    static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        else {
            return reverse(str.substring(1)) + str.charAt(0);

        }
    }

}
