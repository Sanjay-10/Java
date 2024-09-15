import java.util.Scanner;

class Sansujay {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int num[] = new int[5];

        System.out.println("Enter your 5 Number = ");
        for (int i = 0; i < 5; i++) {
            num[i] = obj.nextInt();
        }

        System.out.println("Entered Numbers Are = ");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

    }
}