
public class Fibonacci {

    public static void generateFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " numbers: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Generate Fibonacci series up to 10 numbers
        generateFibonacciSeries(n);
    }
}
