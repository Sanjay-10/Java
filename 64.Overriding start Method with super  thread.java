
class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        System.out.println("Sanjay");
        // t.start(); // repeat nhi kar sakte error aayega isme
    }
}

class Mythread extends Thread {
    public void run() {
        System.out.println("RUN");
    }

    public void start() {
        super.start(); // start me aake ye Threadme bhej deta h jisse run method execute hota h
                       // Main method , START and Sanjay ko print karane ka kaam karte and child bas
                       // RUN
        System.out.println("START");
    }

}