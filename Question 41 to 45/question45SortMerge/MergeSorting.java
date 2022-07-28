package question45SortMerge;

public class MergeSorting {
    /*
     * void merge(int[] arr, int l, int m, int r) {
     * int n1 = m - l + 1;
     * int n2 = r - m;
     * 
     * int[] L = new int[n1];
     * int[] R = new int[n2];
     * 
     * for (int i = 0; i < n1; i++) {
     * L[i] = arr[l + i];
     * }
     * for (int j = 0; j < n2; j++) {
     * R[j] = arr[m + 1 + j];
     * }
     * 
     * int i = 0;
     * int j = 0;
     * int k = l;
     * 
     * while (i < n1 && j < n2) {
     * if (L[i] <= R[j]) {
     * arr[k] = L[i];
     * i++;
     * }
     * 
     * else {
     * arr[k] = R[j];
     * j++;
     * }
     * k++;
     * }
     * 
     * while (i < n1) {
     * arr[k] = L[i];
     * i++;
     * k++;
     * }
     * 
     * while (j < n2) {
     * arr[k] = R[j];
     * j++;
     * k++;
     * }
     * 
     * }
     * 
     */

    void merge(int[] arr, int l, int m, int r) {
        int i, j, k;
        i = l; // for temp[]
        j = m + 1;
        k = l;// for arr[]

        int[] temp = new int[r + 1];
        for (int c = 0; c <= r; c++) {
            temp[c] = arr[c];
        }

        while (i <= m && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            }

            else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
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

    void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 54, 2, 456, 84, 25, 21 };
        System.out.println("Given Array::");
        printArray(arr);

        MergeSorting ob1 = new MergeSorting();
        ob1.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array::");
        printArray(arr);

    }

}
