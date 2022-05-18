package question15;

public class Question15 {
    public static void main(String[] args)
    {
        int num=252;
        int t1=num;

        int rev=0,rem;

        while(t1!=0)
        {
            rem=t1%10;
            rev=(rev*10)+rem;
            t1=t1/10;

        }
        if(num==rev)
        {
            System.out.println("Palindrome");
           
        }

        else{
            System.out.println("Not Palindrome!!!!!");
        }
    }
    
}
