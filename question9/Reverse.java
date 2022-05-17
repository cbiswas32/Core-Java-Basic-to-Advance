package question9;
import java.util.Scanner;
public class Reverse {
    public static void main(String args[])
    {
        long rev=0, rem;
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10) + rem;
            n=n/10;
           
        }
        System.out.println("The reversed number is "+rev);

    }
    
}
