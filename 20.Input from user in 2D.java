import java.util.Scanner;

class Sanjayf {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Row  = ");
        int r = obj.nextInt();
        System.out.print("Enter Column  = ");
        int c = obj.nextInt();

        int[][] num = new int[r][c];

        for (int i = 0; i < r; i++) {

            System.out.println("Enter row " + (i + 1) + " data = ");

            for (int j = 0; j < c; j++) {

                num[i][j] = obj.nextInt();
            }

        }

        System.out.println("You Entered = ");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                System.out.print(num[i][j] + " ");

            }
            System.out.println();

        }

    }
}