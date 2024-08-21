import java.util.Scanner;

public class p8{
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        System.out.print( "Enter The Number : ");
        int n = sc.nextInt();
        int i;
        for(i = 2; i <= n ; i++){
                if(n % i == 0){
                    n = n/i;
                    System.out.print(i + " ");
                    i--;
                }
            }
        }
    }

