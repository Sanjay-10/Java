import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your 4 Names \n");

        String name[] = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Name " + (i + 1) + " : ");
            name[i] = sc.nextLine();
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Name " + (j + 1) + " : " + name[j]);
        }
    }
}