import java.util.Scanner;
public class CountPosNegZero{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n,pos=0,neg=0,zero=0;
        
        System.out.print("Enter the array length:");
        n=sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
           
            System.out.println("Enter a["+i+"]:");
            a[i]=sc.nextInt();
           
            if(a[i]>0)
                pos++;
            else if(a[i]<0)
                neg++;
            else
                zero++;
        }
        
        System.out.println("Positive no :" + pos);
        System.out.println("Negative no :" + neg);
        System.out.println("Zeros :" + zero);
    }
}