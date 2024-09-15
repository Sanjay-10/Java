import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        // String name = sc.next(); for first word only. no count after space

        System.out.print("Your Name is : " + name);

    }
}
