package Collection;

import java.util.Set;
import java.util.LinkedHashSet;

class LinkedHashSe {
    public static void main(String[] args) {

        Set<Integer> num = new LinkedHashSet<>();
        // set ki property to implement karega but LinkedList ki bhi karega
        // jo order me element dale h wahi order me milenege

        // copy paste of HashSet data
        num.add(1);
        num.add(22);
        num.add(2);
        num.add(55);
        num.add(4);
        num.add(4);

        System.out.println(num);

        num.remove(55);
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
