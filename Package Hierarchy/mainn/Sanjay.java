package mainn;

import Gadget.*;
import Gadget.mobos.*;
import Gadget.lappyos.*;

public class Sanjay {
    public static void main(String args[]) {

        Mobile objm = new Mobile();
        Laptop objl = new Laptop();
        Windows objw = new Windows();
        Android obja = new Android();

        objm.dispm();
        objl.displ();
        objw.dispw();
        obja.dispa();

    }
}