class Sanjaypriotiy {
    public static void main(String[] args) {

        Mythread1 t = new Mythread1();
        Mythread2 tt = new Mythread2();
        t.setPriority(1);
        tt.setPriority(10);

        t.start();
        tt.start();
        System.out.println("Main Thread");
    }
}

class Mythread1 extends Thread {
    public void run() {
        System.out.println("Child Thread");
    }
}

class Mythread2 extends Thread {
    public void run() {
        System.out.println("second Thread");
    }
}
