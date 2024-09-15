import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        int num[] = { 11, 22, 33, 44, 55 };
        int mark[];
        mark = num;

        System.out.println("Marks = ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mark[i]);
        }

    }
}