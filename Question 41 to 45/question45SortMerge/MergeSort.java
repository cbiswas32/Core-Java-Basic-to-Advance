package question45SortMerge;

public class MergeSort {

    void merge(int[] arr, int l, int mid, int r) {
        // first subarray is arr[l..mid]
        // second subarray is arr[mid+1..r]

        // find the sizes of two sub array

        int n1 = mid - l + 1;
        int n2 = r - mid; // r-(mid+1)+1 = r-mid-1+1

        // creating two temporaty arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Coping Data to Temp arrays

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // initialize the index of first and second sub arrays
        int i = 0, j = 0;

        // initial index of merged array

        int k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }

            else {
                arr[k] = right[j];
                j++;

            }
            k++;
        }

        // Copy the remaining elements in left[]

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements in right[]

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;

        }

    }

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2; // find the middle point

            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);

    }

}
