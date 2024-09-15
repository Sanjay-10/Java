
// Thread(String Name)

class Sanjay {
    public static void main(String[] args) {

        Mythread t = new Mythread("Sanjay Thread");
        t.start();
        System.out.println("Main Class");
    }
}

class Mythread extends Thread { // extends ,, means this not by runnable
    public void run() {
        System.out.println(Thread.currentThread().getName()); // gives name of Thread
    }

    Mythread(String name) { // ye Mythread humne banaya isme ye pelese nhi hota isliya likha , input lene
        super(name);
    }

}

/*************************************************************************/
// Thread(runnable_target , String_name)

class Sanjay {
    public static void main(String[] args) {

        Mythread myt = new Mythread();
        Thread t = new Thread(myt, "Sanjay Thread"); // ye main Thread class me pelese string name lene method hai,
                                                     // runnable h isliye thread ko bhi call karna pdega
        // Mythread(String name) iski jarurat nhi kyuki ab Thread me ye pelese likha
        // hota isliya , input lene
        t.start();
        System.out.println("Main Class");
    }
}

class Mythread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()); // gives name of Thread
    }
}