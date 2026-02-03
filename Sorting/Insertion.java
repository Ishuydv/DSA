public class Insertion {

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                arr[j] = arr[j] + arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] = arr[j] - arr[j - 1];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 9, 7, 6, 8};
        insertionSort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
