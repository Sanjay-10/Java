
// ....  IMPORTANT DS  ..................

// To give priority of any elements

package Collection;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

class Priority1 {
    public static void main(String[] args) {

        // PriorityQueue<Integer> num = new PriorityQueue<>(); ek hi baat
        Queue<Integer> num = new PriorityQueue<>(Comparator.reverseOrder());
        num.offer(10);
        num.offer(21);
        num.offer(30);
        num.offer(1);
        num.offer(2);

        System.out.println(num);
        // by dafault min heap DS use ho raha h to srif first element minimum wala hoga
        // and baki random orders me hoga , heap kuch kar raha hoga

        num.poll();
        System.out.println(num);
        System.out.println(num.peek());

        // priority change karne parameter dena hoga
        // Comparator.reverseOrder() for max heap
    }

}
