/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Server extends Thread {

    private String str;
    private int port;

    public Server(int port) {
        this.port = port;
    }

    private void excute() throws IOException {
        System.out.println("Server is listening...");

        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        str = in.readUTF();
        while (true) {
            Chuoi c = new Chuoi(str);
            out.writeUTF("Chuỗi sau khi đảo là: " + c.getRd() + "\n");
            out.writeUTF("Chuỗi sau khi in hoa là: " + c.getRh()+ "\n");
            out.writeUTF("Chuỗi sau khi in thường là: " + c.getRt()+ "\n");
            out.writeUTF("Chuỗi sau khi cả in hoa và in thường là: " + c.getRht()+ "\n");
            out.writeUTF("Số từ trong chuỗi là: " + c.getRdt()+ "\n");

            in.close();
            out.close();
            server.close();
        }

    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(6066);
        server.excute();
    }

}
