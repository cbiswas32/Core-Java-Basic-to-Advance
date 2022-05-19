package question16;

public class Armstrong {

    public static void main(String[] args){
        

        int number=153;
        int t1=number;
        int length=0;

        

        while(t1!=0)
        {
            t1=t1/10;   //1st step Get the Length of the Number
            length++;

        }

        //System.out.println(length);
        
        
        //USING THE REVERSE CONCEPT
        int t2=number;
        int rem;
        int arm=0;

        while(t2!=0)
        {
            int mul=1;
            rem=t2%10;

            for(int i=1; i<=length; i++)
            {
                mul=mul*rem;
                //System.out.println("mul" +i+" " +mul);

            }
            arm=arm+mul;
            //System.out.println("arm" + arm);
            t2=t2/10;


        
        }

        if(number==arm)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }



    }
    
}
