
class Sanppp {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.disp();
    }
}

class Student {
    String name = "Rahul";
    int roll = 56;
}

interface Project {
    int Proj = 5; // public static final

    public void proj(); // Abstract Method
}

class Mark extends Student {
    int Total = 550;
}

class Result extends Mark implements Project {
    public void proj() {
        System.out.println("Numbers of projects : " + Project.Proj);
    }

    void disp() {
        System.out.println("Name : " + name + "\nRoll No : " + roll);
        proj();
        System.out.println("Total MArks : " + Total);
    }
}