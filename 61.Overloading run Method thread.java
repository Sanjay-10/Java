
class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start(); // isse bus bina aruments wale methods hi call honge
        t.run(100); // arguments/ parameter wale khudse invoked karna pdega
    }
}

class Mythread extends Thread {
    public void run() {
        System.out.println("Without Arguments");
    }

    public void run(int i) {
        System.out.println("With Arguments : " + i);
    }
}