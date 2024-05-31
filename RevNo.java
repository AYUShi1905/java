import java.util.Scanner;

public class RevNo {
    public static void main(String[] args) {

        RevNo re = new RevNo();
        int num = 0, rev = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter The Number ["+ (i + 1) +"]: ");
            num = sc.nextInt();

            rev = re.Reverse(num);

            System.out.println("Reverse : " + rev);
        }
    }

    int Reverse(int x)
    {
        int rev = 0;

        for (int i = 0; x != 0; i++)
        {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return rev;
    }
    
}
