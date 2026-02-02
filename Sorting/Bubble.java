public class Bubble {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swap = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = false;
                }
            }
            if (!swap) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 68, 58, 32, 56};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
