package question19;


/*

   *
  **
 ***
****

*/
public class SP3 {

    public static void main(String[] args)
    {
        for(int i=1; i<=4;i++)
        {
            for(int j=3; j>=i; j--  )// for blank spaces
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)// for stars
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
