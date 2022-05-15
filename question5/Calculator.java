package question5;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No1:");
        int a=s.nextInt();
        System.out.println("Enter No2:");
        int b=s.nextInt();
        System.out.println("Enter Operation:");
        System.out.println("Example +  -  x  /");
        String symbol=s.next();

        switch(symbol)
        {
            case "+" :  c=a+b;
                        System.out.println(c);
                        break;

            case "-" :  c=a-b;
                        System.out.println(c);
                        break;

            case "x" :  c=a*b;
                        System.out.println(c);
                        break;

            case "/" :  c=a/b;
                        System.out.println(c);
                        break;

            default:    System.out.println("Invalid Input!");
                        break;

        }


    }

    
}
