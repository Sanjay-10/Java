class Sdanjay {
    public static void main(String args[]) {
        Student1 obj = new Student1();
        Student1 obj2 = new Student1(); // 2nd obj of same class
        Student2 gen = new Student2();
        obj.marks = 150;
        obj2.marks = 1000;
        gen.marks = 500;

        System.out.println("Roll no = " + obj.roll);
        System.out.println("Marks = " + obj.marks);
        System.out.println("Roll no = " + obj2.roll);
        System.out.println("Marks = " + obj2.marks);

        System.out.println("Roll no = " + gen.roll);
        System.out.println("Marks = " + gen.marks);

    }
}

class Student1 {
    int roll = 55; // dono instance var
    int marks;
}

class Student2 {
    int roll = 5;
    int marks;
}