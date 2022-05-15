package question3;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Question3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.println(year+" is Leap year");
        }

        else 
        {
            System.out.println(year+" is not Leap year"); 
        }
    }
    
}
