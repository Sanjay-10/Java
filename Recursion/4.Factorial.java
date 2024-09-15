package Recursion;

class Factorial1 {

    public static void main(String[] args) {

        System.out.println(fn(3));

    }

    static long fn(long n) {
        if (n == 0) {
            return 1;
        }

        return n * fn(n - 1);

    }

}
