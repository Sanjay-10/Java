class Sanjay {
    public static void main(String[] args) throws InterruptedException {
        Mythread.mt = Thread.currentThread();

        Mythread t = new Mythread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);

        }
    }
}

class Mythread extends Thread {
    static Thread mt;

    public void run() {

        try {
            mt.join(2000); // child class me to t.join likh diya par main class k time kya likhege ? isliye
                           // mt thread banake usme main thread assign kar diya.
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
