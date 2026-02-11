import java.util.Arrays;

public class Radix {

    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences
        for (int j : arr) {
            count[(j / place) % 10]++;
        }

        // Change count[i] so that count[i] contains actual position
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (iterate from end for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            int idx = count[digit] - 1;
            output[idx] = arr[i];
            count[digit]--;  
        }

        // Copy output array to arr
        System.arraycopy(output, 0, arr, 0, n);
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    static void radixSort(int[] arr){
        int max = findMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
