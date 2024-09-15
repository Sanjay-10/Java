
class Sanjay {
    public static void main(String[] args) {

        Mythread mt = new Mythread();
        Thread t = new Thread(mt); // linked
        t.start();
        System.out.println("Sanjay");
    }
}

class Mythread implements Runnable {
    public void run() {
        System.out.println("RUN");
    }
}