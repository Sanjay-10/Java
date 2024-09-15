class Sanjay {
    public static void main(String args[]) {

        int num[] = { 1, 2, 3, 4, 5 };
        int total = 0;

        for (int i : num) {
            if (i == 3) {
                continue;
            }
            total = total + i;
            System.out.println(i);

        }

        System.out.println("Total = " + total);

    }
}