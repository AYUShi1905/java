import java.util.Scanner;

public class p3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in meters: ");
        double meters = input.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(meters + " meters = " + feet + " feet");
    }
}
