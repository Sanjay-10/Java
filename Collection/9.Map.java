package Collection;

import java.util.Map;
import java.util.HashMap;

class LearnMap12 {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("five", 5);
        numbers.put("Six", 6);
        // ye sab entry hai
        System.out.println(numbers);

        // numbers.put("Two", 22); // override kar deta h agar key same h to
        // System.out.println(numbers);

        // na karna ho override then

        numbers.putIfAbsent("Two", 23); // ab key "Two" nhi hoga tab hi dalega
        System.out.println(numbers);

        // Iterate ***************************

        System.out.println();

        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println();

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        for (Integer num : numbers.values()) {
            System.out.println(num);
        }

        System.out.println();

        // System.out.println(numbers.containsValue(55));

        // System.out.println(numbers.isEmpty());

        // numbers.clear();
        // System.out.println(numbers);

    }

}