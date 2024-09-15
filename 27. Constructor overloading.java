
class Sanjay {
    public static void main(String[] args) {

        Test obj = new Test(10, 20, 50, 0);

    }
}

class Test {

    Test(int a, int b) // Parameterized constr
    {
        System.out.println("Addn = " + (a + b));
    }

    Test(int a, int b, int c, int d) {
        System.out.println("Addn = " + (a + b + c + d));
    }
}