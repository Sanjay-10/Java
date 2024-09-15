package Collection;

import java.util.Arrays;

// ArrayClass Array pe manipulation karti hai , ArrayList nhi
class ArraysClass19 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // for (int i : num) {
        // System.out.println(i);
        // }

        // binary search works on sorted Array
        int index = Arrays.binarySearch(num, 4);
        System.out.println(index);

        int[] arr = { 9, 2, 4, 6, 3, 1, 5, 7, 8 };
        Arrays.sort(arr); // uses Quick sort

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        Arrays.fill(arr, 12);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
