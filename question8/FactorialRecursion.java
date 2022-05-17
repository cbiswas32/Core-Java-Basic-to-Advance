package question8;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Enter the Number.");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        System.out.println("Factorial of " + no + " is");
        FactorialRecursion f = new FactorialRecursion();
        int fact = f.calFact(no);
        System.out.println("factorial is " + fact);
        s.close();

    }

    int calFact(int no) {

        if (no == 0) {
            return 1;

        }

        return no * calFact(no - 1);

    }

}
