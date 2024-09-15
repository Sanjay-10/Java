class Sanjay {
    public static void main(String args[]) {
        try {
            getdata1();
            getdata2();
        } catch (NullPointerException e) {
            System.out.println("Exception is handled in Main");
        }
    }

    static void getdata1() {
        try {
            int a = 100 / 5;
            System.out.println("A : " + a);
        } catch (ArithmeticException e) {
            throw new NullPointerException(); //
        }
    }

    static void getdata2() {
        try {
            int b = 100 / 0;
            System.out.println("B : " + b);
        } catch (ArithmeticException e) {
            throw new NullPointerException();
        }
    }
}
