public class Array2 {

    static int pairSum(int[] arr, int target) {
        int ans = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int i = a + 1; i < arr.length; i++) {
                int sum = arr[i] + arr[a];
                if (sum == target) {
                    System.out.println(arr[a] + " " + arr[i]);
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int manipulation(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int j : arr) {
            if (j != -1) {
                ans = j;
            }
        }

        return ans;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int secondMax(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        return findMax(arr);
    }

    static int firstRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int[] arr2 = {2, 1, 3, 5, 1, 2, 3};
        int[] arr3 = {1, 5, 3, 4, 6, 3, 4};
        int target = 12;

//        System.out.println(pairSum(arr, target));
//        System.out.println("Total number pairs = " + tripletSum(arr, target));
//        System.out.println("unique element is :"+manipulation(arr2));
//        System.out.println("second maximum value is "+secondMax(arr));

        System.out.println("first repeating number is " + firstRepeated(arr3));
    }
}
