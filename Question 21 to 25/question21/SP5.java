package question21;

/*

    *
   **
  ***
 ****
  ***
   **
    *

*/

public class SP5 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4;i++)
        {
            for(int j=3;j>=i;j--) // for blanck spaces
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) // for stars
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int l=1; l<=3;l++)
        {
            for(int m=1;m<=l;m++) // for blanck spaces
            {
                System.out.print(" ");
            }
            for(int n=3;n>=l;n--) // for stars
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
