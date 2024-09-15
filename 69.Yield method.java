class Sanyieldjay {
    public static void main(String[] args) {

        Mythreadd t = new Mythreadd();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }
    }
}

class Mythreadd extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
