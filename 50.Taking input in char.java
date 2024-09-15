import java.util.Scanner;

class Sanjay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char a = sc.next().charAt(0); // 0 means agar koi strings dega to bhi first character lega , dusra no. ex. 3
                                      // likha to sanjay me j o/p dega
        System.out.println(" You Entered : " + a);
    }
}