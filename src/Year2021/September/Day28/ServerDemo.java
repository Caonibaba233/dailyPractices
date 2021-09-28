package Year2021.September.Day28;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("new.jpg");

        int read = 0;
        while((read = inputStream.read()) != -1){
            fileOutputStream.write(read);
        }
        socket.shutdownInput();

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("download finish".getBytes());
        socket.shutdownOutput();

        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
