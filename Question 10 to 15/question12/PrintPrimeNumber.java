package question12;

public class PrintPrimeNumber {

    public static void main(String[] args)
    {
        int pn=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=2; j<=i-1;j++)
            {
                if(i%j==0){
                    pn=pn+1; 

                }

            }
            if(pn==0)
            {
                System.out.println(i);
            }
            else{
                pn=0;
            }
        }

    }
    
}
