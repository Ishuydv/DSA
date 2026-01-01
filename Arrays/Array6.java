import java.util.Scanner;

public class Array6 {

    static void prefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static void suffixSum(int[] arr) {
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i+1];
        }
    }

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int j : arr) {
            totalSum += j;
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 2, 1};

        /*
        prefixSum(arr);
        Array3.printArray(arr);
        int[] prefixSum = arr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Sum = " + ans);
        }
         */

//        System.out.println(equalSumPartition(arr));

        suffixSum(arr);
        Array3.printArray(arr);
    }
}
