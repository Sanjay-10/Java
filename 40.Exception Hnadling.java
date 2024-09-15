import java.util.Scanner;

class Divison {
    public static void main(String args[]) {

        try { /// ye pure method ko try me daal diya par jarurat nhi kyu jaha error throw hoga
              /// uske aage ka code run nhi hoga , isliye specific rakho,and uske niche hi
              /// catch stat.
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter no. 1 = ");
            int a = sc.nextInt();
            System.out.print("Enter no. 2 = ");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("Divison = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Divison by Zero is not possible.");
        }

    }

}

// ****************** Better way of Writting *********************

// import java.util.Scanner;

// class Divison {
// public static void main(String args[]) {

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter no. 1 = ");
// int a = sc.nextInt();
// System.out.print("Enter no. 2 = ");
// int b = sc.nextInt();

// try {
// int c = a / b;
// System.out.println("Divison = " + c);
// }
// catch(ArithmeticException e){
// System.out.println("Divison by Zero is not possible.");
// agar catch k andr d=100/0 likha h tab firse error throw karega vo bas try ka
// error dekhta h baki k errors show karega hi

// }

// System.out.println("Rest of the code");

// }

// }
