class Sabjay {
    public static void main(String args[]) {
        Display obj = new Display();
        obj.disp();
    }
}

class Display {
    static int add() {
        int a = 10, b = 15;
        return (a + b);
    }

    void disp() {
        System.out.println("Addition = " + add());
    }

}