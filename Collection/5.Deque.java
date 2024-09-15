package Collection;

import java.util.Queue;
import java.util.ArrayDeque;

class Deque4 {
    public static void main(String[] args) {

        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.offer(1);
        num.offerFirst(0);
        num.offerLast(10);
        num.offer(55);

        System.out.println(num);

        System.out.println(num.peek()); // normal peek me first element batayega , normal queue jesa
        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());

        // System.out.println(num.poll()); first hatayega
        num.pollFirst();
        System.out.println(num);
        num.pollLast();
        System.out.println(num);
    }

}
