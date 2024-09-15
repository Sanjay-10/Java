package Recursion;

class ex {
    public static void main(String[] args) {
        fn();
    }

    static void fn() { // no condition so infinite loop
        System.out.println("1");
        fn();
    }
}

// n numbers

class HelloWorld {
    public static void main(String[] args) {
        fns(5);
    }

    static int count = 0;

    static void fns(int n) {
        if (count == 5) {
            return;
        }
        count++;
        System.out.println(count);

        fns(n);
    }
}
