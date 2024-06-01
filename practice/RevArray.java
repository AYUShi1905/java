import java.util.Scanner;
public class RevArray{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter length of array:");
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
        }
        System.out.println("Current Array");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Reverse Array");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
