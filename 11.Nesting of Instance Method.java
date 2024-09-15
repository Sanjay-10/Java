class Sanjjay {
    public static void main(String args[]) {
        Addition obj = new Addition();
        obj.disp();

    }
}

class Addition {
    int add() {
        int a = 10, b = 40;
        return (a + b);
    }

    void disp() {
        int r = add();
        System.out.println(r);
    }
}