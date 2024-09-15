package Collection;

import java.util.TreeMap;
import java.util.Map;

class TreeMappp1 {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Six", 6);
        // ye sab entry hai
        System.out.println(numbers);

        numbers.remove("Six");
        System.out.println(numbers);

        // numbers.put("Two", 22); // poverride kar deta h agar key same h to
        // System.out.println(numbers);

        // na karna ho override then

        numbers.putIfAbsent("Two", 23); // ab key "Two" nhi hoga tab hi dalega
        System.out.println(numbers);

        // Iterate ***************************

        // for (Map.Entry<String, Integer> e : numbers.entrySet()) {
        // System.out.println(e);
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        // for (String key : numbers.keySet()) {
        // System.out.println(key);
        // }

        // for (Integer num : numbers.values()) {
        // System.out.println(num);
        // }

        System.out.println(numbers.containsValue(55));

        System.out.println(numbers.isEmpty());

        numbers.clear();
        System.out.println(numbers);

    }

}
