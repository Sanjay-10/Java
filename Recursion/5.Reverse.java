package Recursion;

class Reverse {
    public static void main(String[] args) {

        int[] array = { 5, 3, 8, 7, 6, 1 };
        int l = (array.length) - 1;

        reversefn(array, 0, l);

        PrintArray(array);
    }

    static void reversefn(int[] arr, int start, int end) { // ek se karna hoto , i , n-i-1
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversefn(arr, start + 1, end - 1);
    }

    static void PrintArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
