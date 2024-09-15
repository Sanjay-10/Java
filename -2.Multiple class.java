class Example {
    int a, b, total;

    void add() {
        total = a + b;
    }
}

class sanjay {
    public static void main(String args[]) {
        Example obj = new Example();
        obj.a = 15;
        obj.b = 10;
        obj.add();
        System.out.println("Marks = " + obj.total);

    }
}