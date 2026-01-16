public class Recursion1 {

    static void printArray(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    static int maxInArray(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        int smallAns = maxInArray(arr, i + 1);
        return Math.max(smallAns, arr[i]);
    }

    static int arraySum(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return arr[i] + arraySum(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 76, 32, 65, 87, 54};
        int[] arr2 = {1, 2, 3, 4, 5};
//        printArray(arr, 0);
//        System.out.println(maxInArray(arr, 0));
        System.out.println(arraySum(arr2, 0));
    }
}
