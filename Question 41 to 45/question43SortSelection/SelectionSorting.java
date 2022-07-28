package question43SortSelection;

public class SelectionSorting {

    void selectionsort(int[] a) {

        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min_value_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_value_index]) {
                    min_value_index = j;
                }
            }

            // Swapping Operation
            int temp = a[min_value_index];
            a[min_value_index] = a[i];
            a[i] = temp;
        }

    }

    void printarray(int[] a) {
        int l = a.length;
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SelectionSorting selection = new SelectionSorting();
        int[] a = { 12, 24, 8, 4, 45, 25, 1 };
        selection.selectionsort(a);
        System.out.println("Sorted Array:: ");
        selection.printarray(a);
    }
}
