package question7;
import java.util.Scanner;
public class Question7 {
   
    static int fact=1; 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Question7 cal=new Question7();
        cal.calFact(num);
    
        System.out.println("Factorial of "+num+" will be "+fact);

    }

    void calFact(int num)
    {
        if(num>1)
        {
            fact=fact*num;
            calFact(num-1);

        }
    }
}
