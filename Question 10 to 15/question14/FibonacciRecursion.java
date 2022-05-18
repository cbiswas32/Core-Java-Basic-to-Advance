package question14;

public class FibonacciRecursion {

    static int a=0,b=1,c;
    public static void main(String[] args)
    {
        
        System.out.print(a+" "+b);
        FibonacciRecursion fr= new FibonacciRecursion();
        fr.calFib(10);



    }
    
    void calFib(int i)
    {
       if(i>=1)
       {
            c=a+b;
             
            System.out.print(" "+c);
            a=b;
            b=c;
            calFib(i-1);
       }
        

    }
}
