import java.io.*;
import java.net.*;

class Server{
public static void main(String[] args)throws IOException {
ServerSocket serverSocket = new ServerSocket(4500);

while(true){
    Socket socket =  serverSocket.accept();
    DataInputStream inputStream = new DataInputStream(socket.getInputStream());
    System.out.println(inputStream.readUTF());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
    out.writeUTF("Hello , client it's my pleasure to talk to you!");
    
    serverSocket.close();
}

}}
