package question17;
/*
*
**
***
****

*/
public class SP1 {

    public static void main(String[] args)
    {
        SP1 sp= new SP1();
        sp.firstPattern();

       
        System.out.println();

        SP1 sp1= new SP1();
        sp1.secPattern();

        System.out.println();

        SP1 spa= new SP1();
        spa.altsecPattern();
       
    }

/*
*
**
***
****

*/    

    void firstPattern()
    {
      for(int i=1;i<=4;i++)
        {

            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }  
        

        


    }
/*

****
***
**
*

*/
    void secPattern()
    {
        for(int i=4; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void altsecPattern()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }


}

