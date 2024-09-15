
class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class Geeky {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start(); // start k badle t.run(); karenege to main , child hi run hoga infinite times
                   // ,kyuki ab method call ho raha h , thread nhi mana jayega
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}

// output maybe

// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread

// OR

// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Child Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread

// OR

// Child Thread
// Child Thread
// Child Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Child Thread
// Child Thread
