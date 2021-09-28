package Year2021.September.Day28;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:\\360MoveData\\Users\\js-7735\\Desktop\\leecodePractice\\src\\Year2021\\September\\Day28\\img.jpg");
        Socket client = new Socket("localhost", 10086);
        OutputStream outputStream = client.getOutputStream();

        int read = 0;
        while ((read = fileInputStream.read()) != -1) {
            outputStream.write(read);
        }
        client.shutdownOutput();

        InputStream inputStream = client.getInputStream();
        StringBuilder msg = new StringBuilder();
        byte[] buffer = new byte[1024];
        while ((read = inputStream.read()) != -1) {
            inputStream.read(buffer);
            msg.append(new String(buffer,0,read));
            buffer = null;
        }
        client.shutdownInput();
        System.out.println(msg.toString());

        inputStream.close();
        outputStream.close();
        client.close();
        fileInputStream.close();
    }
}
