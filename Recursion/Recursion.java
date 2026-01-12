public class Recursion {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
//        printIncreasing(100);
//        System.out.println(factorial(12));
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
