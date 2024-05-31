import java.util.Scanner;

public class UndhoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("a[i][j]" + a[i][j]);
            }
            System.out.println("\n");
        }
        for (int i=2;i>=0;i--){
            for(int j=2;j>=0;j--){
                System.out.println(a[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
