import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name[][] = new String[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter i[" + i + "][" + j + "]: ");
                name[i][j] = sc.nextLine();
            }
        }

        System.out.println("\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Entered i[" + i + "][" + j + "] : " + name[i][j]);
            }
        }
    }
}