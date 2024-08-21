// public class Client {
    
// }
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("Hello from client!");
            System.out.println("\nData sent to server.");

            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
