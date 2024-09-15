class Sanjddyd {
    public static void main(String arg[]) {

        Son s = new Son();
        Daughter d = new Daughter();
        s.disp();
        d.disp();

    }
}

abstract class Father {
    abstract void disp();
}

class Son extends Father {

    void disp() {
        System.out.print("Son\n");
    }

}

class Daughter extends Father {

    void disp() {
        System.out.print("Daughter");
    }

}
