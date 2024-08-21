// public class OOP_15_ExceptionHandling02 {
    
// }
public class OOP_15_ExceptionHandling02 {
    
    public static void main(String[] args) {
        try {
            
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        try {
           
            String str = "abc";
            int num = Integer.parseInt(str); // Trying to parse a non-integer string
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

}
