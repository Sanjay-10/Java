class Sanjay {
    public static void main(String[] args) throws InterruptedException {

        Mythread t = new Mythread();
        t.start();
        t.join(); // or (5000)ms or (5000,1000)ms,ns
        // t.join iss main method me lagaya hai islye ye t thread khtm hone tak wait
        // karega , time add karenge to utne time tak hi wait karega
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");

        }
    }
}

class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
