public class Recursion2 {

    static int pow(int p, int q) {
        if (q == 0) return 1;
        int smallPow = pow(p, q / 2);
        if (q % 2 == 0) return smallPow * smallPow;
        return p * smallPow * smallPow;
    }

    static void printMultiples(int n, int k) {
        if (k == 0) return;
        printMultiples(n, k - 1);
        System.out.println(n * k);
    }

    static int seriesSum2(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) return seriesSum2(n - 1) - n;
        return seriesSum2(n - 1) + n;
    }

    public static void main(String[] args) {
//        System.out.println(pow(5, 3));
//        printMultiples(5, 5);
        System.out.println(seriesSum2(10));
    }
}
