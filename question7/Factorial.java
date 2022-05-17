package question7;

public class Factorial {
    public static void main(String[] args)
    {
    int fact=1;
    int n=6;
    for(int i=n;i>=1;i--)
    {
        fact=fact*i;

    }
    System.out.println(fact);
}
}
