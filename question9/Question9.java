package question9;

import java.util.Scanner;
public class Question9 {

    static int rev=0,rem;
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        Question9 c=new Question9();
        c.calRev(num);
        System.out.println(rev);



    }

    void calRev(int num)
    {
        if(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;

            calRev(num/10);
            
        }


    }


    
}
