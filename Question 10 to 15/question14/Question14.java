package question14;

public class Question14 {
    
    static int a=0,b=1,c;
    public static void main(String[] args)
    {
        System.out.print(a+" "+b);
        Question14 prfibo=new Question14();
        prfibo.printFib(10);


    }

    void printFib(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printFib(i-1);
        }
    }
}
