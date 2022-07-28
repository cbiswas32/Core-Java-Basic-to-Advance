package question44SortInsertion;

public class InsertionSortNew {
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 54, 47, 6, 22, 1 };

        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;

            }

            arr[j] = temp;
        }

        printArray(arr, len);
    }

}
