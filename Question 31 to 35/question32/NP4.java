package question32;
/*
1
121
12321
1234321
123454321

*/

public class NP4 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=i;k>=1;k--)
            {

                if(i==k)
                {
                    System.out.print("");    
                }
                else
                {

                    System.out.print(k);  
                }
               
            }
            System.out.println();
        }
    }
    
}
 