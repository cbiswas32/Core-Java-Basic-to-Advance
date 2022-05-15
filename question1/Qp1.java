package question1;

import java.util.Scanner;


public class Qp1 {


    static int r=0;
   
    
    public static void main(String[] args)
    {
        
        int n=10548;
        
        Qp1 ab = new Qp1();
        ab.calrev(n);
   
        System.out.println(r);
    }

    void calrev(int n)
    {   int l;
        if(n!=0)
        {
        l=n%10;
        r=r*10 + l;
        calrev(n/10);
        }


    }

}       