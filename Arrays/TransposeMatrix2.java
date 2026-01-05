import java.util.Scanner;

public class TransposeMatrix2 {

    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    static void transposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int q = arr.length - 1;
        int r = 0;
        while (q > r) {
            Array3.swapInArray(arr, r, q);
            q--;
            r++;
        }
    }

    static void rotateMatrix(int[][] matrix, int n) {
        transposeInPlace(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter number of rows and columns of matrix ");

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr2 = new int[row][col];

        System.out.println("Enter elements of matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("original matrix is ");
        TwoDimensionalArray.printMatrix(arr2);

        System.out.println("Rotated matrix is ");
        rotateMatrix(arr2, row);
        TwoDimensionalArray.printMatrix(arr2);
         */

        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        TwoDimensionalArray.printMatrix(ans);
    }
}
