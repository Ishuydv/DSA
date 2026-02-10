import java.util.Arrays;

public class Quick {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) cnt++;
        }
        int pivotInd = cnt + st;
        swap(arr, st, pivotInd);

        int i = st, j = end;
        while (i < pivotInd && j > pivotInd) {
            while (i < pivotInd && arr[i] <= pivot) i++;
            while (j > pivotInd && arr[j] > pivot) j--;
            if (i < pivotInd && j > pivotInd) {
                swap(arr, i++, j--);
            }
        }

        return pivotInd;
    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;

        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 1, 5, 4, 8, 6};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
