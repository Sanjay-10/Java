class Sanjay {
    public static void main(String args[]) {

        int[][] num = new int[3][];
        // num[0] = new int[3];
        // num[1] = new int[2];
        // num[2] = new int[1];

        // num[0][0] = 1;
        // num[0][1] = 2;
        // num[0][2] = 3;
        // num[1][0] = 4;
        // num[1][1] = 5;
        // num[2][0] = 6;

        int num1[] = { 1, 2, 3 };
        int num2[] = { 4, 5 };
        int num3[] = { 6, 5, 9, 8, 7 };

        num[0] = num1;
        num[1] = num2;
        num[2] = num3;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }

    }
}