public class Array5 {

    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                Array3.swapInArray(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }

    }

    static void oddEvenSort(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                Array3.swapInArray(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            Array3.swapInArray(arr, left, right);
            left++;
            right--;
        }
    }

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n-1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
//        reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {-10, -5, -2, 1, 4, 9};

//        oddEvenSort(arr2);
//        Array3.printArray(arr2);

        Array3.printArray(sortSquare(arr3));
    }
}
