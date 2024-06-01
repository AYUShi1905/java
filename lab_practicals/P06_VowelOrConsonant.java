import java.util.Random;

public class P06_VowelOrConsonant{
    public static void main(String[] args) {
        Random rm = new Random();

        for(int i= 1 ; i < 6; i++){            
            char a = (char) ('A' + rm.nextInt(26));
            char b = (char) ('A' + rm.nextInt(26));
            char c = (char) ('A' + rm.nextInt(26));
    
            int n = rm.nextInt(9999);
    
            System.out.print("Random Number ["+ i +"] : ");
            System.out.println(a + "" + c + "" + b + " " + n );
        }
    }
}
