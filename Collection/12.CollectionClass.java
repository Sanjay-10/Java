package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollectionClass44 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(85);
        num.add(0);
        num.add(2);

        System.out.println("Minimum Element = " + Collections.min(num));
        System.out.println("Maximum Elemefnt = " + Collections.max(num));

        System.out.println("Freq. of 2 = " + Collections.frequency(num, 2));

        Collections.sort(num); // ascending order
        Collections.sort(num, Comparator.reverseOrder());
        System.out.println(num);

    }
}
