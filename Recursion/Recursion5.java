import java.util.ArrayList;

public class Recursion5 {
    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> list = new ArrayList<>();
        if (s.isEmpty()) {
            list.add("");
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for (String str : smallAns) {
            list.add(str);
            list.add(ch + str);
        }
        return list;
    }

    static void printSSQ(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, ans + ch);
        printSSQ(remString, ans);
    }

    static void subsetSum(int[] arr, int n, int idx, int sum) {
        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        subsetSum(arr, n, idx + 1, sum + arr[idx]);
        subsetSum(arr, n, idx + 1, sum);
    }

    public static void main(String[] args) {
//        System.out.println(getSSQ("abc"));
//        printSSQ("abc", "");
        int[] arr = {2, 4, 5};
        subsetSum(arr, arr.length, 0, 0);
    }
}
