package question26;

/*
     *
    * *
   *   *
  *     *
 *       *

 
 --------------



 *       *
  *     *
   *   *
    * *
     *




*/

public class SP10 {
    public static void main(String[] args)
    {
        SP10 newSPSp10=new SP10();
        newSPSp10.firstSP10();

        System.out.println();

        SP10 newSPSp10a=new SP10();
        newSPSp10a.secondSP10();

    }

    void firstSP10()
    {

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++)
            {
               if( (i>=2) && (k>1) && (k<((i*2)-1)) )
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
    
    
    void secondSP10()
    {
        //// first method


        System.out.println("secondSP10() method: ");
        System.out.println();

        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(" ");
            }

            for(int k=11; k>i*2; k--)
            {
                if(k<11 && k>((i*2)+1) )
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




        //another method
        System.out.println("Another method: ");
        System.out.println();

        for(int i=5; i>=1; i--)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }

            for(int k=1; k<i*2; k++)
            {
                if(k>1 && k<((i*2)-1))
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
