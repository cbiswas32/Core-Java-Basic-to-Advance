package question44SortInsertion;

public class InsertionSorting {

    void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }

            a[j] = temp;
        }

    }

    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = { 24, 10, 1, 25, 45, 87, 7 };
        InsertionSorting in = new InsertionSorting();

        in.insertionSort(a);
        in.printArray(a);

    }

}
