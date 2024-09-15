import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int i, num;
        System.out.print("Enter a num = ");
        num = obj.nextInt();
        for (i = 0; i < num; i++) {
            System.out.println(i + 1);
        }
    }
}