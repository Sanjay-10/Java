package Recursion;

class n1nn {

    public static void main(String[] args) {
        fns(1, 3);
    }

    static void fns(int n, int m) {
        if (n > m) {
            return;
        }

        System.out.println("Sanjay");
        n++;
        fns(n, m);
    }

    // NOrmal

    // public static void main(String[] args) {
    // fns(5);
    // }

    // static int count = 0;

    // static void fns(int n) {
    // if (count == 5) {
    // return;
    // }
    // count++;
    // System.out.println("Sanjay");

    // fns(n);
    // }

    // ******** Opposite order ****************

    // static void fns(int n, int m) {
    // if (n > m) {
    // return;
    // }

    // System.out.println(m);
    // m--;
    // fns(n, m);
    // }

}
