package Collection;

// import java.util.*;   for all 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

class Collection111 {
    public static void main(String args[]) {

        List<Integer> num = new LinkedList<>(); // for LinkedList .. explain in queue file

        List<Integer> List = new ArrayList<>(); // dynamic array
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);
        List.add(0, 0); // at specific index
        System.out.println(List);

        List<Integer> NewList = new ArrayList<>(); // New Array
        NewList.add(11);
        NewList.add(12);

        System.out.println(NewList);

        List.addAll(NewList); // List me NewList k int add kar diye
        System.out.println(List);

        System.out.println(List.get(2)); // get the index element

        List.remove(4); // removed element of index 4
        System.out.println(List);
        // O(n) time complexity jab bhi add ya remove kare , kyuki ek ek elemenet aage
        // ya piche hote
        List.remove(Integer.valueOf(12)); // removed specified element
        System.out.println(List);

        // List.clear(); // Cleared full list
        // System.out.println(List);

        List.set(3, 33); // Rewrite element of that index ... O(1)
        System.out.println(List);

        System.out.println(List.contains(33)); // t or f , element hai ya nhi ... O(n)

        // To print every element of Array ***********************************

        for (int i = 0; i < List.size(); i++) {
            System.out.println("For - Element " + (i + 1) + " = " + List.get(i));
        }

        for (int element : List) { // easy- recommended
            System.out.println("For each - Element " + " = " + element);
        }

        // Iterator
        Iterator<Integer> it = List.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator = " + it.next());
        }
    }
}