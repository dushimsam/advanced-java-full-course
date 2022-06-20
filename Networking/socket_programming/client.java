// Network programming tools
import java.net.*;

// IO exceptions classes.
import java.io.*;

class Client{
    public static void main(String[] args)throws IOException{
        Socket clientSocket = new Socket("localhost",4500);
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

        // Write datat to the output stream
        out.writeUTF("Hello server");

        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
        // Read data from the input stream
        System.out.println(in.readUTF());

        clientSocket.close();
    }
}
