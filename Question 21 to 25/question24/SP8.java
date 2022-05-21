package question24;


/*
*******
 *****
  ***
   *




*/

public class SP8 {
    public static void main(String[] args)
    {
        System.out.println("firstMethod()");
        SP8 patternSp8 = new SP8();
        patternSp8.firstMethod();

        System.out.println();
        System.out.println("secondMethod();");

        SP8 patternSp8a = new SP8();
        patternSp8a.secondMethod();


        System.out.println();
        System.out.println("thirdMethod()");

        SP8 patternSp8b = new SP8();
        patternSp8b.thirdMethod();


    }
    

 
    void firstMethod()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for( int k=4; k>=i;k--)
            {
                System.out.print("*");
            }
            for(int l=3;l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void secondMethod()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }

            for(int k=9; k>i*2; k--)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    void thirdMethod()
    {
        for(int i=4; i>=1;i--)
        {
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");

            }
            for(int k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
