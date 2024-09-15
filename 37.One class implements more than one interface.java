class Sanjay {
    public static void main(String arg[]) {
        Son obj = new Son();
        obj.disp();
        obj.add();
    }
}

interface Father {
    public static final int mark = 500;
    int roll = 100;

    public void disp();

}

interface Mother {
    int mark1 = 100;

    void add();

}

class Son implements Father, Mother {
    int sum = Father.mark + Mother.mark1; // bina mother father likhe bhi kaam ho sakta h par pblm tab aayegi jab dono
                                          // interface me same var name honge ex. mark and amrk to class ko nhi samjhega
                                          // ki konse ka mark lena hai

    public void disp() {
        System.out.println("Roll no. = " + Father.roll);
    }

    public void add() {
        System.out.println("Result = " + sum);
    }
}