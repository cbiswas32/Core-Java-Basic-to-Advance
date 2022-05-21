package question25;
/*
Diagonal Star Pattern
*
 *
  *  
   *
    *


-----------

     *
    * 
   *  
  * 
 *

*/

public class SP9 {
    public static void main(String[] args)
    {
        System.out.println("firstDiagonalPattern()");
        SP9 diagonalPSp9= new SP9();
        diagonalPSp9.firstDiagonalPattern();

        System.out.println();
        System.out.println("secondDiagonalPattern()");

        SP9 diagonalPSp9a= new SP9();
        diagonalPSp9a.secondDiagonalPattern();

        System.out.println();
        System.out.println("firstDiagonalPattern if else()");

        SP9 diagonalPSp9c= new SP9();
        diagonalPSp9c.firstDifelse();

        System.out.println();
        System.out.println("secondDiagonalPattern if else()");

        SP9 diagonalPSp9d= new SP9();
        diagonalPSp9d.secondDifelse();

    }

    void firstDiagonalPattern()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }
        
    }


    void secondDiagonalPattern()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");  
            }

            System.out.print("*");
            System.out.println();
        }
    }



    void firstDifelse()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
                if(i>=2 && j<i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }


    void secondDifelse()
    {

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++)
            {
               if(i>=2 && k>1)
               {
                System.out.print(" ");
               }
               else
               {
                System.out.print("*");
               }
            }
            System.out.println();
        }

    }
    
}
