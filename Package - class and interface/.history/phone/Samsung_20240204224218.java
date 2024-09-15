package phone;

public class Samsung {
    public int s = 40;

    public void disps() {
        Apple obja = new Apple(); // same package ka hai isliye no need to write "import phone"
        obja.dispa();
        System.out.println("This is Samsung = " + s);
    }
}
