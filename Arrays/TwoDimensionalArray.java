public class TwoDimensionalArray {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible - wrong dimension");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        printMatrix(mul);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 1},
                {3, 1, 2}
        };

        int[][] arr2 = {
                {2, 1},
                {1, 3},
                {1, 1}
        };

        multiply(arr,2,3,arr2,3,2);
    }
}
