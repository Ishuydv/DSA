public class RectangleSum {

    static int findSum(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    static int findSum2(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }

        }
        return sum;
    }

    static void findPrefixSumMatrix2(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Row-wise prefix
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Column-wise prefix
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    static int findSum3(int[][] matrix, int l1, int l2, int r1, int r2) {
        findPrefixSumMatrix2(matrix);

        int sum = matrix[l2][r2];   // ✅ FIXED
        int up = 0, left = 0, leftUp = 0;

        if (l1 > 0) {
            up = matrix[l1 - 1][r2];
        }
        if (r1 > 0) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 > 0 && r1 > 0) {
            leftUp = matrix[l1 - 1][r1 - 1];
        }

        return sum - up - left + leftUp;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 1, 1},
                {1, 1, 1}
        };

//        System.out.println(findSum(arr, 1, 2, 1, 2));
//        System.out.println(findSum2(arr, 1, 2, 1, 2));
        System.out.println(findSum3(arr, 1, 2, 1, 2));
    }
}
