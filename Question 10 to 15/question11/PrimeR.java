
package question11;
public class PrimeR
{
    public static void main(String[] args)
    {
        int num=11;
        PrimeR pr=new PrimeR();
        pr.calPrime(num);


    }


    void calPrime(int num)
    {
        int ref=0;
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                ref=ref+1;
            }
        }
        if(ref>0)
        {
            System.out.println("number is not Prime");


        }
        else
        {
            System.out.println("number is Prime");
        }

    }
}