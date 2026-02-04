public class Zeros {

    static void moveZeros(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void sortFruits(String[] strs) {
        int n = strs.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (strs[j].compareTo(strs[min]) < 0) {
                    min = j;
                }
            }
            String temp = strs[i];
            strs[i] = strs[min];
            strs[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 5, 0, 4};
        String[] fruits = {"kiwi","apple","papaya","mango"};

        sortFruits(fruits);

        for (String s : fruits){
            System.out.print(s + " ");
        }

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }
}
