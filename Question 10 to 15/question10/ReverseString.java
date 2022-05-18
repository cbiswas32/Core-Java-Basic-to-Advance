package question10;

public class ReverseString {
    public static void main(String args[])
    {
        String rev="";
        String name="chinmoy";
        int len=name.length();

        for(int i=len-1;i>=0;i--)
        {
            rev= rev + name.charAt(i);

        }
        System.out.println(rev);

    }
    
}
