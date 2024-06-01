import java.util.Scanner;

public class P05_Sorting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = input.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.print(n1 + " ");
            if (n2 >= n3) {
                System.out.print(n2 + " " + n3);
            } else {
                System.out.print(n3 + " " + n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.print(n2 + " ");
            if (n1 >= n3) {
                System.out.print(n1 + " " + n3);
            } else {
                System.out.print(n3 + " " + n1);
            }
        } else {
            System.out.print(n3 + " ");
            if (n1 >= n2) {
                System.out.print(n1 + " " + n2);
            } else {
                System.out.print(n2 + " " + n1);
            }
        }
    }
}
