class Sanjay {
    public static void main(String args[]) {
        Addition obj = new Addition();
        obj.disp(5, 6);
        obj.disp(5, 5.55f);
        obj.disp(5, 50f);

    }
}

class Addition {
    void disp(int a, int b) {
        System.out.println(a + b);
    }

    void disp(int a, float b) {
        System.out.println(a * b);
    }
}