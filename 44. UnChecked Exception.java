import java.util.Scanner;

class LowBalanceException extends RuntimeException {
    public LowBalanceException() {
        super("Insufficient Fund");
    }
}

// user defined exception bas checked me banta hai , ye batane k liye ki
// unchecked bhi bana sakte hai iska fayda nhi

class Exceptiontest { // throws idr likhne ka idr fayda nhi Unchecked exception me
    public void atm(int fund) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        int amount = sr.nextInt();
        if (amount > fund) {
            throw new LowBalanceException();
        } else {
            System.out.println("Remaining Balance : " + (fund - amount));
        }
    }
}

class Test {
    public static void main(String[] args) {
        Exceptiontest obj = new Exceptiontest();
        obj.atm(10000);
    }
}