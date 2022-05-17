package question6;

import java.util.Scanner;
public class Multiplicationtable {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the No.");
        int n=s.nextInt();
        
        System.out.println("Multiplication Table of "+n);

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+"="+n*i);
        }
    }
    
}
