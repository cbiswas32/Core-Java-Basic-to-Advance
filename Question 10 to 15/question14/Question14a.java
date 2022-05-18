package question14;

public class Question14a {
    
    static int a=0, b=1;
    
    public static void main(String[] args)
    {
        System.out.print(a+" "+b);
        Question14a pff=new Question14a();
        pff.pFib(10);


    }

    void pFib(int i)
    {
        int c;
       if(i>=1)
       {
        c=a+b;
        a=b;
        b=c;
        System.out.print(" "+c);
        pFib(i-1);
       }

    }
}
