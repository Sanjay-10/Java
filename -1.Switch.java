import java.util.Scanner;

class Sanjfay {
    public static void main(String args[]) {
        int num;
        Scanner day = new Scanner(System.in);
        System.out.print("Enter Day number : ");
        num = day.nextInt();

        switch (num) {
            case 1: {
                System.out.println("Monday");
                break;
            }

            case 2: {
                System.out.println("Sunday");
                break;
            }

            default: {
                System.out.println("No-day");
            }

        }

    }

}