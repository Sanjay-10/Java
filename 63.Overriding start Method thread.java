
class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start(); // ab isme start ko call kiya h t=mythread me jake dekhega start h to vo execute
                   // hoga and ab ye normal method ban gaya h , thread nhi raha . pehle start
                   // myhread me dekhta tha nhi hone pe Thread me jake start execute hota tha waha
                   // iska function likha thread run hone a , abhi start call karke overrride
                   // kardiya .
        System.out.println("Sanjay");
    }
}

class Mythread extends Thread {
    public void run() {
        System.out.println("RUN");
    }

    public void start() {
        System.out.println("START");
    }

}