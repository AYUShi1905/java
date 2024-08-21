import java.util.Scanner;
import java.util.Random;

public class OOP_13_Bank_Acc {
    public static void main(String[] args) {
        acct acc1 = new acct();

        acc1.initializ();
        acc1.deposit();
        acc1.withdraw();
        acc1.display();
    }
}

class acct {
    Scanner sc = new Scanner(System.in);
    String Name;
    long acc_no;
    double balance;

    public void initializ() {
        Random rd = new Random();
        System.out.print("Enter the name : ");
        Name = sc.nextLine();

        // System.out.print("Enter the account no : ");
        // acc_no = sc.nextLong();
        acc_no = rd.nextLong(10000000);

        System.out.print("Enter the balance : ");
        balance = sc.nextDouble();
    }

    public void deposit() {
        System.out.print("\nEnter the amount for deposit :");
        double amt = sc.nextDouble();
        balance = balance + amt;
        System.out.println("updated balance : " + balance);
    }

    public void withdraw() {
        System.out.print("\nbalance = " + balance);
        System.out.print("\nEnter the amount for withdrwal:");
        double amt = sc.nextDouble();

        if (balance > amt) {
            balance = balance - amt;
            System.out.println("updated balance : " + balance);
        } else {
            System.out.println("you cannt withdraw the amount.");
        }
    }

    public void display() {
        System.out.println("\nname :" + Name);
        System.out.println("Account No : " + acc_no);
        System.out.println("Balance : " + balance);
    }
}