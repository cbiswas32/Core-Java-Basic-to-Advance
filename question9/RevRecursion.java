package question9;

public class RevRecursion {

    static int ans = 0;

    public static void main(String[] args) {
        int number = 45214;
        System.out.print(calRev(number));

    }

    static int calRev(int number) {
        if (number == 0) {
            return ans;
        }

        if (number > 0) {
            int rem = number % 10;
            ans = ans * 10 + rem;
            calRev(number / 10);
        }

        return ans;
    }

}
