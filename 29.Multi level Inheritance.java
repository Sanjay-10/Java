
class HelloWorlddd {
    public static void main(String[] args) {

        Grandson obj = new Grandson();

        obj.getdata(10, 10);
        obj.disp();

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
    int c = 10;

    int add() {
        int sum = a + b + c;
        return sum;
    }

}

class Grandson extends Son {

    void disp() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("Sum = " + add());
    }

}