import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String = ");
        str = obj.nextLine();
        System.out.println("String is " + str);
        System.out.print("Enter an integer = ");
        a = obj.nextInt();
        System.out.println("Integer is " + a);
        System.out.print("Enter Float = ");
        b = obj.nextFloat();
        System.out.println("Float is " + b);

    }

}
