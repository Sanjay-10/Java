package Collection;

import java.util.Stack;

class Stackh {
    public static void main(String args[]) {

        Stack<String> Animals = new Stack<>();
        Animals.push("Lion");
        Animals.push("Tiger");
        Animals.push("Elephant");
        Animals.push("Zebra");

        System.out.println(Animals);

        System.out.println(Animals.peek()); // at top

        Animals.pop(); // remove element
        System.out.println(Animals.peek());

    }
}
