package question45SortMerge;

public class MergeSortSingleArr {

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void merge(int[] arr, int l, int mid, int r) {

        int[] temp = new int[r + 1];
        for (int i = l; i < r + 1; i++) {
            temp[i] = arr[i];
        }

        int i = l, j = mid + 1;
        int k = l;

        while (i <= mid && j <= r) {
            if (temp[i] < temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;

            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        while (j <= r) {
            arr[k] = temp[j];
            j++;
            k++;

        }

    }

    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);

        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 25, 4, 2, 65, 4, 212, 5 };
        int len = arr.length;

        printArray(arr, len);

        sort(arr, 0, len - 1);
        printArray(arr, len);

    }

}
