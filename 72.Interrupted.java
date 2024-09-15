class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}

class Mythread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
                Thread.sleep(3000, 10);
            }
        } catch (InterruptedException e) {
            System.out.println("Interruptrd");
        }
        System.out.println("End");
    }
}

// JAB BHI SLEEP YA WAIT AAYEGA TAB HI INTERRUPT ACTIVATE HOGA

class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");
    }
}

class Mythread extends Thread {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
        System.out.println("Sleeping");

        try {
            Thread.sleep(3000, 10);
        } catch (InterruptedException e) {
            System.out.println("Interruptrd");
        }
        System.out.println("End");
    }
}
