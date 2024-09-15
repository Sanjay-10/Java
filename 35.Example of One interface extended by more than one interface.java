class Sanjay {
    public static void main(String arg[]) {

    }
}

interface Father {
    public static final int mark = 500;
    int roll = 100;

    public void disp();

    void putdata();

    int add(int x, int y);
}

interface Mother 
{
    int class = 20;
    void ab();
}

interface Son extends Father, Mother {
    int attendance = 70;

    void putdata();
}
