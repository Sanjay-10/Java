import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char a[][] = new char[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Character " + "a[" + i + "]" + "[" + j + "]" + " : ");
                a[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]" + " : " + a[i][j]);
            }
            System.out.println();
        }
    }
}