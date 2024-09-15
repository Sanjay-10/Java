class PatternsStriver9857m {
    public static void main(String args[]) {
        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // Pattern5(5);
        // Pattern6(5);
        // Pattern7(5);
        // Pattern8(5);
        // Pattern9(5);
        // Pattern10(5);
        // Pattern11(5);
        // Pattern12(3);
        // Pattern13(5);
        // Pattern14(5);
        // Pattern15(5);
        // Pattern16(5);
        // Pattern17(4);
        // Pattern18(5);
        // Pattern19(5);
        // Pattern20(5);
        // Pattern21(5);
        Pattern22(5);
    }

    static void Pattern22(int n) {
        int num = n + (n - 1);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                int top = i;
                int bottom = num - i - 1;
                int left = j;
                int right = num - j - 1;

                System.out.print(n - Math.min(
                        (Math.min(top, bottom)), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    static void Pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void Pattern20(int n) {
        for (int i = 1; i <= n * 2; i++) {

            int leftstr = i < n ? i : (n * 2) - i;
            for (int j = 0; j < leftstr; j++) {
                System.out.print("*");
            }

            int spc = i < n ? (n * 2) - i * 2 : (i * 2) - n * 2;
            for (int k = 0; k < spc; k++) {
                System.out.print(" ");
            }

            int rightstr = i < n ? i : (n * 2) - i;
            for (int l = 0; l < rightstr; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern19(int n) {
        for (int i = 0; i < n * 2; i++) {

            int leftstr = i < n ? n - i : i - n + 1;
            for (int j = 1; j <= leftstr; j++) {
                System.out.print("*");
            }

            int spc = i < n ? i * 2 : (i - (3 * (i - n)) + 3);
            for (int l = 0; l < spc; l++) {
                System.out.print(" ");
            }

            int rightstr = i < n ? n - i : (i - n) + 1;
            for (int k = 1; k <= rightstr; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern18(int n) {
        char ch = (char) ('A' + n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (ch - j) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int brkpnt = (i * 2 + 1) / 2;

            for (int k = 1; k <= i * 2 + 1; k++) {

                System.out.print(ch);
                if (k <= brkpnt)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        // char ch = 'A';

        // for (int j = 0; j < (n - i) - 1; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k <= i; k++) {

        // System.out.print(ch);
        // ch++;
        // }
        // for (int l = i - 1; l >= 0; l--) {

        // System.out.print((char) ('A' + l));
        // }
        // System.out.println();
        // }
    }

    static void Pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();

        }
    }

    static void Pattern15(int n) {
        for (int i = n; i > 0; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }
    }

    static void Pattern14(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + "");
            }
            System.out.println();

        }
    }

    static void Pattern13(int n) {
        int add = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((add) + " ");
                add += 1;
            }
            System.out.println();

        }
    }

    static void Pattern12(int n) {

        int space = 2 * (n - 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 0; l--) {
                System.out.print((l + 1));
            }
            System.out.println();
            space -= 2;
        }
    }

    static void Pattern11(int n) {
        int start;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;
            for (int j = 0; j < i; j++) {

                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void Pattern10(int n) {
        int m = n * 2;
        for (int i = 0; i < m; i++) {
            int str = m / 2 > i ? i : m - i;
            for (int j = 0; j < str; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n) {

        int m = n * 2;
        for (int row = 0; row < m; row++) {

            int spc = row < m / 2 ? n - row : (row - n + 1);
            for (int i = 1; i < spc; i++) {
                System.out.print(" ");
            }

            int str = row < m / 2 ? (row * 2) + 1 : m - (2 * row - n * 2) - 1;
            for (int j = 0; j < str; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((n * 2) - (i * 2) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(1 + (n - j));
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}