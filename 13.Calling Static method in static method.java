/*********** Same class ****************/

class Sanjay {
    public static void main(String args[]) {
        disp();
    }

    static void disp() {
        System.out.println("Helllllllooooooo");
    }
}

/********** different class ************/

class Sanjay {
    public static void main(String args[]) {
        Display.disp(); // just wrote the class name from which we calling a method
    } // we can also creaet obj but static gives this feature then why need to make
      // code lengthy
}

class Display {

    static void disp() {
        System.out.println("Helllllllooooooo");
    }

}
