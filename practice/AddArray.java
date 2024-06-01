import java.util.Scanner;
public class AddArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array a:");
            a[i]=sc.nextInt();
        }
        
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of array b:");
            b[i]=sc.nextInt();
        }

        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[i]+b[i];
        }
        System.out.println("After Addition");
        for(int i=0;i<n;i++){
            System.out.println(c[i] + "");
        }
    }
}