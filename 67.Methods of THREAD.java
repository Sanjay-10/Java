/******** currentThread() Method *********/

class Sanjay {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.start();
        System.out.println(Thread.currentThread());
    }
}

class Mythread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

/******** getName() Method *********/

class Sanjay {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.start();
        System.out.println(mt.getName());
        System.out.println(Thread.currentThread().getName()); // currentThread means jo abhi thread chal raha h uska
                                                              // name
    }
}

class Mythread extends Thread {
    public void run() {
        // System.out.println(Thread.currentThread());
    }
}

/******** setName() Method *********/

class Sanjay {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Mythread mt = new Mythread();
        mt.start();
        System.out.println(mt.getName());

        mt.setName("Yoyoyoyo");
        System.out.println(mt.getName());

        Thread.currentThread().setName("Main Boss");
        System.out.println(Thread.currentThread().getName());

        // System.out.println(10/0); isme exception konse thread me exception aaya uska
        // naam aayega , hmne thread name chnage kiya to uss name se thread name aayega
    }
}

class Mythread extends Thread {

    public void run() {
    }
}

/******************** setPriority() Method *************************/

class Sanjay {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(2);
        System.out.println(Thread.currentThread());

        Mythread t = new Mythread();
        t.setPriority(9);
        t.start();
    }
}

class Mythread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}