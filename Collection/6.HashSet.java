package Collection;

import java.util.HashSet;
import java.util.Set;

// dublicates elements are not allowed , property of set
// ELements are add in random orders bcoz of hashing har value ka hash banata h jisme random order and same hash wale elements avoid karta

class Set128 {
    public static void main(String[] args) {

        Set<Integer> num = new HashSet<>();

        // VERY Optimizide
        // every below operations .. O(1)
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(5);
        num.add(4);
        num.add(4);

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
