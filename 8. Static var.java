class Snajay {
    public static void main(String main[]) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.mark = 100;
        obj2.mark = 300;
        System.out.println("Mark ob obj 1 = " + obj1.mark);
        System.out.println("Mark of obj 2 = " + obj2.mark);

    }
}

class Student {
    static int mark;
}