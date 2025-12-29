public class Array {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int lastOccurrense(int[] arr,int a) {
        int c = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                c = i;
            }
        }
        return c;
    }

    static boolean isSorted(int[] arr){
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
//        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(isSorted(arr));

    }
}
