package question27;
/*

 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *




*/

public class SP11 {

    public static void main(String[] args)
    {
        System.out.println("First Method::"); /// Donot Use this Metod for this type of Pattern
        System.out.println();
        SP11 sp11a = new SP11();
        sp11a.firstSP11();

        System.out.println("Second Method::");
        System.out.println();
        SP11 sp11b = new SP11();
        sp11b.secondSP11();
        
    }

    void firstSP11() /// avoid this method and go to second method
    {
        for(int i=5; i>=1;i--)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i*2; k++)
            {
               if(k>1 && k<(i*2)-1)
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


        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++)
            {
                if(k>1 && k<(i*2)-1)
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

    


    // Second Method is More Important and correct
    void secondSP11()
    {

        for(int i=0;i<5;i++)
        {
            for(int j=0; j<5;j++)
            {
                if(i==j || (i+j)==(5-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
