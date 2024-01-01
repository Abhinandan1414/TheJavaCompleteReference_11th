package AIPlayground;

public class MergeSort {
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, n - mid);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    // Generate the main method
    public static void main(String[] args) {
        int[] array = { 10, 5, 3, 7, 2 };
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        mergeSort(array);

        System.out.println("\nSorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
