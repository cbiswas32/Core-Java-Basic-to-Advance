package question16;

public class ArmstrongPalindrome {
    public static void main(String[] args)
    {

        ArmstrongPalindrome pal=new ArmstrongPalindrome();
        pal.Palindrome();

        System.out.println();

        ArmstrongPalindrome arrm=new ArmstrongPalindrome();
        arrm.Armstrong();


    }



    void Palindrome()
    {
        int number=262;
        int rem,rev=0;
        int t=number;

        while(t!=0)
        {
            rem=t%10;
            rev=(rev*10)+rem;
            t=t/10;
        }

        if(number==rev)
        {
            System.out.println("The number is palindrome");

        }

        else
        {
            System.out.println("The number is NOT palindrome!!");

        }


    }
    void Armstrong()
    {


        int num=152;
        int arm=0;
        int t2=num;
        
        int length=0;

        while(t2!=0)
        {
            t2=t2/10;
            length++;
        }
        

        int t1=num;
        while(t1!=0)
        {
            int r;
            int mul=1;
            r=t1%10;
            for(int k=1;k<=length;k++)
            {

                mul=mul*r;
            }
            arm=arm+mul;
            System.out.println(arm);
            t1=t1/10;
        } 

        if(num==arm)
        {
            System.out.println("The Number is Armstrong");
        }

        else
        {
            System.out.println("The Number is NOT Armstrong!!!");
        }

    }
    
}
