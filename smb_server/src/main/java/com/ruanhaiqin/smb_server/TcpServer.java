package com.ruanhaiqin.smb_server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class TcpServer {

    public TcpServer() throws IOException {
        // File file = new File("test.data");

        ServerSocket serverSocket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8081);
        serverSocket.bind(socketAddress);

        Socket socket = serverSocket.accept();

        while(socket != null) {
            byte[] b = new byte[100];
            while(!socket.isClosed()) {
                socket.getInputStream().read(b);
                System.out.println(new String(b));
            }
            System.out.println("closing ....");
            socket.close();
            socket = serverSocket.accept();
        }
        serverSocket.close();
    }
    


}
