/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import Bai1.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Client {

    private Inet4Address LocalHost;
    private int Port;
    private String str;

    Scanner sc = new Scanner(System.in);

    public Client(Inet4Address LocalHost, int Port) {
        this.LocalHost = LocalHost;
        this.Port = Port;
    }

    private void excute() {
        try{
        Socket client = new Socket(str, Port);
        DataInputStream in = new DataInputStream(client.getInputStream());
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        System.out.println("Nhập vào 1 chuỗi:");
        str = sc.nextLine();

        out.writeUTF(str);
        while (true) {
            System.out.println(in.readUTF());            
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());

            in.close();
            out.close();
            client.close();
        }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client((Inet4Address) Inet4Address.getLocalHost(), 6066);
        client.excute();
    }
}
