package Recursion;

// 1 to n
class BackTracking {
    public static void main(String[] args) {
        fn(55, 55);
    }

    static void fn(int n, int m) {
        if (n < 1) {
            return;
        }
        fn(n - 1, m);
        System.out.println(n);
    }
}

// n to 1

class HelloWorldl {
    public static void main(String[] args) {
        int n = 51;
        fn(1, n);
    }

    static void fn(int i, int n) {
        if (i > n) {
            return;
        }
        fn(i + 1, n);
        System.out.println(i);
    }

}

// functional recursion

class Solution {
    public static long sumFirstN(long n) {

        return fn(n);

    }

    static long fn(long n) {
        if (n == 0) {
            return 0;
        }

        return n + fn(n - 1);

    }
}