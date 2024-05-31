import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        byte a , b ;
        Scanner sc = new Scanner(System.in);
        a=sc.nextByte();
        b=sc.nextByte();
        // System.out.println(a);
        // System.out.println(b);
        int c = a + b;
        System.out.println(c);
    }
}
