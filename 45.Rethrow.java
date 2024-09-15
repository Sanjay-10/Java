class Sanjay {
    public static void main(String args[]) {
        try {
            getdata1();
            getdata2();
        } catch (ArithmeticException e) {
            System.out.println("Exception is handled in Main");
        }
    }

    static void getdata1() {
        try {
            int a = 100 / 2;
            System.out.println("A : " + a);
        } catch (ArithmeticException e) {
            throw e; // rethrow to main jaha isko handle kiya hai
        }
    }

    static void getdata2() {
        try {
            int b = 100 / 0;
            System.out.println("B : " + b);
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}
