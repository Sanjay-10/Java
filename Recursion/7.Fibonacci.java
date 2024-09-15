package Recursion;

class Hellofib {
    public static void main(String[] args) {
        int n = 50;
        int[] arr = new int[n];
        Fib(n - 1, arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    static int Fib(int n, int[] arr) {
        if (n <= 1) {
            return arr[n] = n;
        }
        return arr[n] = Fib(n - 1, arr) + Fib(n - 2, arr);
    }
}

// WITHOUT RECURSION
class Solution {
    public static int[] generateFibonacciNumbers(int n) {

        int[] Fib = new int[n];

        Fib[0] = 0;
        Fib[1] = 1;

        for (int i = 2; i < n; i++) {
            int ans = Fib[i - 1] + Fib[i - 2];
            Fib[i] = ans;
        }

        return Fib;
    }

}
