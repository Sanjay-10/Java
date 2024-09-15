import java.util.Scanner;

// nayaa exception banaya , under exception me using extends
class LowBalanceException extends Exception {
    public LowBalanceException() { // Constructor
        super("Insufficient Funds"); // string pass kiya
    }

}

class TestException {

    public void atm(int m) throws LowBalanceException { // ye upr puchega lowbalance exception kaha handle hai
        int money = m;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Withdrawal Amount : ");
        int amount = obj.nextInt();

        if (money < amount) {
            throw new LowBalanceException(); // ye error batayega jo delcare kitya h upr
        } else {
            int CurrentBalance = money - amount;
            System.out.println("Remaining Blanace : " + CurrentBalance);
        }
    }
}

class Sanjay9137 {
    public static void main(String args[]) {
        TestException obj1 = new TestException();
        try { // try se error catch karenge
            obj1.atm(10000);
        } catch (LowBalanceException e) { // hoga to Lowbalance ye throw hoga
            System.out.println(e); // or System.out.println("Insufficient Fund"); to srif yehi text dikhega
        }

    }
}

/*************************** OR ***********************************/

// import java.util.Scanner;

// class LowBalanceException extends Exception {
// public LowBalanceException() {
// super("Insufficient Funds");
// }

// }

// class TestException {

// public void atm(int m) {
// int money = m;

// Scanner obj = new Scanner(System.in);
// System.out.print("Enter Withdrawal Amount : ");
// int amount = obj.nextInt();

// if (money < amount) {
// try { // sidha yehi error handle kardiya to throws use ki jarurat nhi , par
// bade project me alag se karna jese upr kiya shi hoga
// throw new LowBalanceException();
// } catch (LowBalanceException e){
// System.out.println("Insufficient Fund");
// }
// } else {
// int CurrentBalance = money - amount;
// System.out.println("Remaining Blanace : " + CurrentBalance);
// }
// }
// }

// class Sanjay9137 {
// public static void main(String args[]) {
// TestException obj1 = new TestException();
// obj1.atm(10000);
// }
// }