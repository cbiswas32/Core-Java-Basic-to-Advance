package question18;

/*

*
**
***
****
*****
****
***
**
*

*/
public class SP2 {

    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        } //for first 4 rows

       
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("* ");

            }
            System.out.println();
        } // for secound 5 rows
    }
    
}
