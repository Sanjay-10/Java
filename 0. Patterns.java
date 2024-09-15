/*https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md*/

class Pan5mfgfgjg95 {
    public static void main(String args[]) {

        Square(5);
        Triangle1(5);
        Triangle2(5);
        Triangle3(5);
        Triangle4(5);
        Triangle5(5);
        Triangle6(5);
        Triangle7(5);
        Triangle8(5);
        Triangle9(5);
        Triangle10(5);
        Triangle11(10);

    }

    static void Triangle11(int n) {
        for (int row = 0; row <= n; row++) {

            int up = row < n / 2 ? row : n - row;
            for (int spc = 0; spc < up; spc++) {
                System.out.print(" ");
            }
            int down = row < n / 2 ? n / 2 - row : row - n / 2;
            for (int str = 0; str < down; str++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle10(int n) {
        for (int row = 0; row < n; row++) {
            for (int spc = 0; spc < row; spc++) {
                System.out.print(" ");
            }
            for (int str = 0; str < n - row; str++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle9(int n) {
        for (int row = 0; row < n; row++) {
            for (int spc = 0; spc < n - row; spc++) {
                System.out.print(" ");
            }
            for (int str = 0; str <= row; str++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Triangle8(int n) {
        for (int row = 0; row < n; row++) {
            for (int spc = 0; spc < row; spc++) {
                System.out.print(" ");
            }
            for (int str = 0; str < ((n - row) * 2) - 1; str++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Triangle7(int n) {
        for (int row = 0; row < n; row++) {
            for (int spc = 0; spc < (n - row); spc++) {
                System.out.print(" ");
            }
            for (int str = 0; str < (row * 2) + 1; str++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void Triangle6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int str = 0; str < n - row; str++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Triangle5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Triangle4(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int item = i > n ? n * 2 - i : i;
            for (int j = 0; j < item; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Triangle3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Triangle1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    static void Square(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}