import java.math.*;
import java.util.*;

class BasicMat7457 {
    public static void main(String[] args) {
        // countDigit(15445);
        // ReverseNumber(649463);
        // Palindrome(1237421);
        // Armstrong(372);
        // Divisor(35646);
        // isPrime(54);
        GCD(850, 2000);

    }

    // Same GCD by Euclidean Algo

    static void GCD(int n, int m) {
        while (n > 0 && m > 0) {
            if (n > m) {
                n = n % m;
            } else {
                m = m % n;
            }
        }
        if (n == 0) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }
    }

    // static void GCD(int n, int m) {
    // int gcd = 0;
    // for (int i = Math.min(n, m); i >= 1; i--) {
    // if (n % i == 0 && m % i == 0) {
    // gcd = i;
    // break;
    // }
    // }
    // System.out.println(gcd);
    // }

    static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (num / i != i) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    // OR

    // public class Solution {
    // public static String isPrime(int num) {
    // int n = num;
    // boolean ans = (ansPrime(n));
    // if (n != 1 && ans == true) {
    // return "YES";
    // } else {
    // return "NO";
    // }

    // }

    // static boolean ansPrime(int n) {

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // }

    static void Divisor(int n) { // O(n)
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.println(i);
        // }
        // }

        // Other Best Method

        Set<Integer> div = new TreeSet<>(); // O(sqrt(n))
        double sq = Math.sqrt(n);
        for (int i = 1; i <= sq; i++) { // OR - i*i <= n
            if (n % i == 0) {
                div.add(i);
                if (n / i != i) {
                    div.add(n / i);
                }
            }
        }

        for (Integer i : div) {
            System.out.print(i + " ");
        }
    }

    static void Armstrong(int n) {
        int dup = n;
        int temp = n;
        int Armstrong = 0;
        int count = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        while (n > 0) {
            int lastdigit = n % 10;
            Armstrong += Math.pow(lastdigit, count);
            n /= 10;
        }

        if (dup == Armstrong) {
            System.out.println("This is a Armstrong Number");
        } else {
            System.out.println("This is NOT a Armstrong Number");
        }
    }

    static void Palindrome(int n) {
        int dup = n;
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n /= 10;
        }

        if (dup == reverse) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }

    static void ReverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n /= 10;
        }
        System.out.println(reverse);
    }

    static void countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Total Digit count = " + count);
    }
}
