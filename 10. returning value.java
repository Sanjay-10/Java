class Sanjayn {
    public static void main(String args[]) {
        Test obj = new Test();
        System.out.println(obj.add());

        int r = obj.mult(10);
        System.out.println(r);

    }
}

class Test {

    int add() { // Instance method
        int a = 10, b = 10;
        return (a + b);
    }

    int mult(int k) { // Instance method
        int f = k;
        return (f * f);
    }
}