package question22;

public class Question22 {
    public static void main(String[] args){
        Question22 pp1=new Question22();
        pp1.firstPattern();
        System.out.println();

        Question22 pp2=new Question22();
        pp2.secoundPattern();
        System.out.println();

        Question22 pp3=new Question22();
        pp3.thirdPattern();
        System.out.println();

        Question22 pp4=new Question22();
        pp4.fourthPattern();
        System.out.println();

        Question22 pp5=new Question22();
        pp5.fifthPattern();
        System.out.println();

        Question22 pp6=new Question22();
        pp6.sixthPattern();
        System.out.println();

        Question22 pp6a=new Question22();
        pp6a.sixthPatternifelse();
        System.out.println();


    }

    void firstPattern(){

        System.out.println("firstPattern()");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void secoundPattern()
    {
        System.out.println("secoundPattern()");
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void thirdPattern()
    {
        System.out.println("thirdPattern()");
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*"); 
            }
            System.out.println();

        }
    }


    void fourthPattern()
    {
        System.out.println("fourthPattern()");

        for(int i=1;i<=4;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");

            }
            for(int k=4;k>=i;k--)
            {
                System.out.print("*"); 
            }
            System.out.println();

        }
    }


    void fifthPattern()
    {

        System.out.println("fifthPattern()");
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*"); 
            }
            System.out.println();

        }

        
        for(int i=1;i<=5;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");

            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("*"); 
            }
            System.out.println();

        }


    }


    void sixthPattern()
    {
        System.out.println("sixthPattern()");

        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *"); 
            }
            System.out.println();

        }

    }

    void sixthPatternifelse()
    {
        System.out.println("sixthPattern_if_else()");

        for(int i=1;i<=4;i++)
        {
            for(int j=4; j>=1;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");

                }

                else
                {
                    System.out.print(" *");
                }
               
            }
            
            System.out.println();
        }

       
    }
    
}
