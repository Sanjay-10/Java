class Sanjay {
    public static void main(String args[]) {

        String name[][] = new String[2][2];
        name[0][0] = "Sanjay ";
        name[0][1] = "Suthar";
        name[1][0] = "Java ";
        name[1][1] = "CPP";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(name[i][j]);
            }
            System.out.println();
        }
        System.out.println(name[0][0].length()); // string ..... length method for string
        System.out.println(name.length); // row ........ length var for row size
        System.out.println(name[0].length); // col ... length var for col isze
    }
}