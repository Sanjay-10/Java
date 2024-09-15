package Collection;

import java.util.LinkedList;
import java.util.Queue;

class Linkedlist {
    public static void main(String args[]) {

        Queue<Integer> queue = new LinkedList<>();

        // add() bhi use kar sakte h but pblm huyi to exception throw karega , to app to
        // close karvani h pblm me to use kar sakte .... offer throws t or f

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        // remove() agar queue khali h to exception throw karega
        System.out.println(queue.poll()); // remove an element .. throws null if empty

        System.out.println(queue);

        // peek() agar kuch nhi hoga to empty batayega , element() bhi same kaam karta h
        // par agar empty hogi list to exception throw karega , app crash karvani hoto
        // use karna ... peek throws null if empty
        System.out.println(queue.peek());

    }
}
