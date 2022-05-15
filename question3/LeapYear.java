package question3;

public class LeapYear {
    public static void main(String[] args)
    {
        int i=2000;
        if(i%4==0)
        {
           if(i%100==0)
           {
                if(i%400==0)
                {
                    System.out.println(i+" is a Leap Year");
                }
                else
                {
                    System.out.println(i+" is NOT a Leap Year");
                }
           }
           else
           {
            System.out.println(i+" is a Leap Year");
           }
        }
        else
        {
            System.out.println(i+" is NOT a Leap Year");
        }
    }
    
}
