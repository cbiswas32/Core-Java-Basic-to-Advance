package question20;

/*

****
 ***
  **
   *

*/

public class SP4 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4;i++)
        {
            for(int j=2;j<=i;j++) // for blanck spaces
            {
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--) // for stars
            {
                System.out.print("*");
            }
            System.out.println();

        }

       
    }
    
}
