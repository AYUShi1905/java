import java.util.Scanner;

public class P04_BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weightp, heightin, bmi, weightkg, heightme;

        System.out.print("Enter Your Height (Inches) : ");
        heightin = sc.nextDouble();

        System.out.print("Enter Your Weight (Pounds) : ");
        weightp = sc.nextDouble();

        weightkg = (weightp * 0.45359237);
        heightme = (heightin * .0254);

        bmi = weightkg / (heightme * heightme);

        System.out.printf("\n\nYour Body Mass Index (BMI) : %.2f \n\n" , bmi);
        sc.close();
        }
    }

