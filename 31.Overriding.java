class Sanjahhjy {
    public static void main(String arg[]) {

        Father f = new Father();
        Son s = new Son();
        Grandson gs = new Grandson();

        f.calc();
        s.calc();
        gs.calc();
    }
}

class Father {
    int a = 10;

    void calc() {
        System.out.println(" Class Father \n");
    }
}

class Son extends Father {

    int b = 20;

    void calc() {
        System.out.println("Class Son");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Sum = " + (a + b));

    }
}

class Grandson extends Father {

    int c = 30;

    void calc() {
        System.out.println("\nClass Grandson");
        System.out.println("A = " + a);
        System.out.println("C = " + c);
        System.out.println("Multiplication = " + (a * c));

    }
}