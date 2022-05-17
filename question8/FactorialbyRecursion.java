package question8;
import java.util.Scanner;
public class FactorialbyRecursion {

    public static void main(String args[])
    {
        int res;
        System.out.println("Enter the Number.");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        FactorialbyRecursion f=new FactorialbyRecursion();
        res=f.calFactRecursion(no);
        System.out.println("Factorial is: " + res);

    }

    int calFactRecursion(int no)
    {

        if(no>=1)
        {
            return(no*calFactRecursion(no-1));
        }
        return 1;
    }
    
}
