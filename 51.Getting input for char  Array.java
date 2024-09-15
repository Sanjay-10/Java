import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("How many Character You want to enter : ");
        n = sc.nextInt();
        char a[] = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Character " + (i + 1) + ": ");
            a[i] = sc.next().charAt(0);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Entered Character " + (j + 1) + " : " + a[j]);
        }
    }
}