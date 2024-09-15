import java.util.Scanner;

class Sanljay {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Number of Rows = ");
        int r = obj.nextInt();

        int[][] num = new int[r][];

        for (int i = 0; i < r; i++) {

            System.out.print("Enter Number of Columns in " + (i + 1) + "st Row = ");
            int n = obj.nextInt();
            num[i] = new int[n];
        }

        System.out.print("Enter the Data =");
        for (int j = 0; j < r; j++) {
            for (int k = 0; k < num[j].length; k++) {
                num[j][k] = obj.nextInt();
            }
        }

        System.out.println("Your Entered Jagged Array = ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();

        }

    }
}
