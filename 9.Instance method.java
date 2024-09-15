/* Instance method Without parameter*/

class Sanjays {
    public static void main(String args[]) {
        Sanjays obj = new Sanjays();
        obj.disp(); // calling instance method
        System.out.println("done");
    }

    void disp() { // instance method
        int a = 10;
        System.out.println(a);
    }

}

/* Instance method With parameter */

class Sanja {
    public static void main(String args[]) {
        Sanja obj = new Sanja();
        obj.displ(5, 5); // calling instance method
        System.out.println("done");
    }

    void displ(int a, int b) { // instance method with para

        System.out.println(a + b);
    }

}
