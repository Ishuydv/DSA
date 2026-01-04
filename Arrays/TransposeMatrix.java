import java.util.Scanner;

public class TransposeMatrix {

    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {4, 5},
                {7, 8}
        };

        System.out.println("Enter number of rows and columns of matrix ");
        Scanner sc = new Scanner(System.in);
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

        System.out.println("Transpose matrix is ");
        TwoDimensionalArray.printMatrix(findTranspose(arr2, row, col));

    }
}
