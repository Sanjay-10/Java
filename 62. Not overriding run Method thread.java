
class Sanjay {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
    }
}

class Mythread extends Thread {
    public void run() {

    }
}

// override nhi kiya to blank op aayega , agar blank hi rakhna h to thread hi
// mat banao.