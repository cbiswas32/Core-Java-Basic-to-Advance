package question12;

public class Question12 {

    public static void main(String[] args)
    {
        int counter=0;
        for(int number=1;number<=100;number++)
        {
            int temp=0;
       

            for(int i=2;i<=number-1;i++)
            {
                if(number%i==0)
                {
                    temp=temp+1;
                }
            }
    
            if(temp==0)
            {
                System.out.print(" "+number);
                counter++;
            }
          
         
        }
        System.out.print("\nThere are "+counter+" prime numbers between 1 and 100");
       

    }
    
}
