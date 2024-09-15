class Sanjay {
    public static void main(String arg[]) {

        Son objs = new Son();
        objs.getdata(20, 20);
        objs.disp();

        Daughter objd = new Daughter();
        objd.getdata(50, 50);
        objd.disp();

    }
}

class Father {
    int a, b;

    void getdata(int x, int y) {
        a = x;
        b = y;
    }
}

class Son extends Father {
    int add() {
        return (a + b);
    }

    void disp() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Sum = " + add());

    }
}

class Daughter extends Father {

    int mult() {
        return (a * b);
    }

    void disp() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Multiplication = " + mult());

    }
}