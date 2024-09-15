class Sanjay {
    public static void main(String args[]) {
        // char a[][] = new char[4][5] ;
        char a[][] = { { 'S', 'A', 'N' }, { 'M', 'A', 'N' }, { 'T', 'A', 'N' } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}