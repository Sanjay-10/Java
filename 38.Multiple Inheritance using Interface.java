class Sanjay {
    public static void main(String arg[]) {
        Son obj = new Son();
        obj.add();

    }
}

class Father {
    public static final int mark = 500;
    int roll = 100;

    public void disp() {
        System.out.println("Roll no. = " + roll);
    }

}

interface Mother {
    int mark1 = 100;

    void add();

}

class Son extends Father implements Mother {
    int sum = Father.mark + Mother.mark1;

    public void add() {
        System.out.println("Result = " + sum);
        disp();
    }
}