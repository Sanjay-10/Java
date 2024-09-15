class Sanjay {
    public static void main(String arg[]) {
        Son obj = new Son();
        obj.disp();
    }
}

interface Father {
    public static final int mark = 500;
    int roll = 100;

    public void disp(); // public na likhte to bhi by default public hota hai ... likhe ya na likhe ,
                        // niche class me likhna padega public

}

class Son implements Father {
    int mark1 = 10;
    int sum = Father.mark + mark1;

    public void disp() {
        System.out.println("Roll no. = " + Father.roll);
        System.out.println("Result = " + sum);
    }
}