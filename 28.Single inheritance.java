
class HelloWorld {
    public static void main(String[] args) {

        Son obj = new Son();

        obj.getdata(20, 10);
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

    void disp() {
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Sum = " + add());
    }

    int add() {
        int sum = a + b;
        return sum;
    }

}