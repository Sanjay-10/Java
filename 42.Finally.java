import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Enter no. 1 = ");
            int a = obj.nextInt();
            System.out.print("Enter no. 2 = ");
            int b = obj.nextInt();

            int c = a / b;
            System.out.println("Division = " + c);

        } catch (ArithmeticException e) {
            // int v = 65/0;
            // ye iske andr likhenge to ye error dega jab error catch karke ye code run hoga
            // tab , or ye handle nhi hoga
            System.out.println("Cant divide by zero");
        }

        finally { // ye hameshha run hoga bhale upr code me error aaye ya nhi
            // int x = 85/0; ye iske andr likhenge to ye error dega,
            System.out.println("I'll Will Run whether Exceptions is handled or not !");
        }

    }
}
