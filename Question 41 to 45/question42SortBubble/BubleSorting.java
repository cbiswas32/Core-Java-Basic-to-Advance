package question42SortBubble;

public class BubleSorting {

    void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++)// for round
        {
            int breaking = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1]; // Swapping
                    arr[j + 1] = temp;
                    breaking = 1;
                }
            }

            if (breaking == 0) {
                break;
            }
        }
    }

    void printArray(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        BubleSorting bubble = new BubleSorting();
        int[] arr = { 10, 87, 5, 25, 4, 21, 245 };

        bubble.bubbleSort(arr);
        System.out.println("Sorted Array::");
        bubble.printArray(arr);

    }

}
