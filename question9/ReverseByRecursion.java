package question9;

public class ReverseByRecursion {
    static int rev=0;
    public static void main(String args[])
    {   
        int n=1125;
        ReverseByRecursion r=new ReverseByRecursion();
        r.Reverse(n);
        System.out.println(rev);
        


    }

    void Reverse(int n)
    {
        int rem;
        if(n!=0){

            rem=n%10;
            rev=(rev*10)+rem;
            Reverse(n/10);
        }

       
        


    }
    
}
