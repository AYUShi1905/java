import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 :");
        int n1=sc.nextInt();
        System.out.print("Enetr n2 : ");
        int n2=sc.nextInt();

        int temp,GCD;

        while(n2 != 0){
            temp = n2;
            n2 = n1 % n2 ;
            n1 = temp;
        }
        GCD = n1;
        System.out.println("GCD = " +GCD);
    }
}
