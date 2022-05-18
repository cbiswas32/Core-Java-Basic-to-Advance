package question15;

public class Palindrome{

    public static void main(String[] args){
        
        int no =122;
        int num = no;
        int rem;
        int rev=0;

        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(no==rev){
            System.out.println("The number is palindrom!");

        }
        else
        {
            System.out.println("Not Palindrome!!!!");
        }



    }

}