package question4;

public class SwapWithOutVariable {
    public static void main(String[] args)
    {
        int a=5, b=7;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    
}
