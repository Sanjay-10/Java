class Sanjay {
    public static void main(String args[]) {

        String name = "Sanjay";
        String name1 = new String("Sanjay");

        System.out.println("Name without new = " + name);
        System.out.println("Name with new = " + name1);

    }
}

/****************** String Object are immutable ********************/
class Sanjay {
    public static void main(String args[]) {

        String name = new String("Sanjay");
        String name2 = name.concat(" Suthar");

        System.out.println("Name = " + name2);

    }
}

/***************** StringBuffer Object are mutable *********************/
class Sanjay {
    public static void main(String args[]) {

        StringBuffer name = new StringBuffer("Sanjay");
        name.append(" Suthar");

        System.out.println("Name = " + name);

    }
}