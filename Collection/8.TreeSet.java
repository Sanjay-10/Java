package Collection;

import java.util.Set;
import java.util.TreeSet;

class TreeSet1 {
    public static void main(String[] args) {

        Set<Integer> num = new TreeSet<>();

        // every below operations = O(log n)
        // bcoz binary search tree andr implement ho raqha h or vo log n hai
        num.add(5);
        num.add(3);
        num.add(4);
        num.add(2);
        num.add(1);
        num.add(0);

        System.out.println(num);

        num.remove(5);
        System.out.println(num);

        System.out.println(num.contains(4));

        System.out.println(num.isEmpty());

        System.out.println(num.size());

        num.clear();
        // mutiple test case k sath kaam kar raheho to use kar sakte purana set clear
        // karega
        System.out.println(num);
    }

}
