package question16;

public class Question16 {

    public static void main(String[] args)
    {
        int number=407;
        int t1=number;

        int len=0;

        while(t1!=0)
        {
            t1=t1/10;
            len++;
        }
       // System.out.println(length);

       int t2=number;
       int rem;
       int arm=0;

       while(t2!=0)
       {
           rem=t2%10;
           int mul=1;
           for(int i=1;i<=len;i++)
           {
               mul=mul*rem;
           }
           arm=arm+mul;
           t2=t2/10;
       }

       if(number==arm)
       {
           System.out.println("Armstrong!");

       }
       else{
           System.out.println("Not Armstrong!!!");
       }



    }
    
}
