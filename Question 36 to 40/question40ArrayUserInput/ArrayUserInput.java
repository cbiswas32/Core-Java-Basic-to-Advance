package question40ArrayUserInput;

import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args)
    {
        int length;
        Scanner input=new Scanner(System.in);
        
        System.out.println("How Many Friends Nmae are you gonna Enter?");
        
        length=input.nextInt();

        String[] names=new String[length];

        for(int i=0;i<length;i++)
        {
            System.out.println("Enter the name"+(i+1));
            names[i]=input.next();
        }
        input.close();

        for(int i=0;i<length;i++)
        {
            System.out.println(names[i]+" ");
        }


    }
    
}
