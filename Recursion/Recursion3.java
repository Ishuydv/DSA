import java.util.ArrayList;

public class Recursion3 {

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx) {
        if (idx >= arr.length) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target) ans.add(idx);
        ArrayList<Integer> smallAns = findAllIndex(arr, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    static void findAllIndex(int[] arr, int n, int target, int idx) {
        if (idx >= n) return;
        if (arr[idx] == target) System.out.print(idx + " ");
        findAllIndex(arr, n, target, idx + 1);
    }

    static int findIndex(int[] arr, int target, int idx) {
        if (idx >= arr.length) return -1;
        if (arr[idx] == target) return idx;
        return findIndex(arr, target, idx + 1);
    }

    static boolean search(int[] arr, int target, int idx) {
        if (idx >= arr.length) return false;
        if (arr[idx] == target) return true;
        return search(arr, target, idx + 1);
    }

    static boolean isSort(int[] arr, int idx) {
        if (idx == arr.length - 1) return true;
        if (arr[idx] > arr[idx + 1]) return false;
        return isSort(arr, idx + 1);
    }

    static int findLastIndex(int[] arr, int idx, int target) {
        if (idx == arr.length) return -1;
        int foundIndex = findLastIndex(arr, idx + 1, target);
        if (foundIndex != -1) return foundIndex;
        if (arr[idx] == target) return idx;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 12, 54, 14, 8, 38, 6, 1};
        int[] arr2 = {1, 2, 3, 2, 2, 5};
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int target = 2;

        System.out.println(findLastIndex(arr2, 0, 2));
        System.out.println(isSort(arr3,0));

        ArrayList<Integer> arrayList = findAllIndex(arr2, target, 0);
        System.out.println(arrayList);

        findAllIndex(arr2, arr2.length, target, 0);
        if (search(arr, target, 0)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
        System.out.println(findIndex(arr, target, 0));
    }
}
