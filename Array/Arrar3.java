public class Array3 {

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void swap(int a, int b) {
        System.out.println("a :" + a + ", b :" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :" + a + ", b :" + b);
    }

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = n - 1, j = 0;
        while (i >= 0) {
            ans[j] = arr[i];
            i--;
            j++;
        }

        return ans;
    }

    static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray2(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 14;

        int[] arr = {1, 2, 3, 4, 5};

        rotateInPlace(arr, 2);
        printArray(arr);
    }
}
