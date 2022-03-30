/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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
        try {
            Socket client = new Socket(str, Port);
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            while (true) {
                System.out.println(in.readUTF());
                int choose = sc.nextInt();
                out.writeInt(choose);
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào 1 số: ");
                        int s = sc.nextInt();
                        out.writeInt(s);
                        System.out.println(in.readUTF());
                        System.out.println(in.readUTF());
                        System.out.println(in.readUTF());
                        System.out.println(in.readUTF());
                        break;
                    case 2:
                        System.out.println("Nhập vào 1 số: ");
                        int m = sc.nextInt();
                        out.writeInt(m);
                        System.out.println("Tổng các chữ số là " + in.readInt());
                        System.out.println("Tích các chữ số là " + in.readInt());
                        break;
                    case 3:
                        System.out.println("Nhập vào 2 số: ");
                        int a1 = sc.nextInt();
                        int a2 = sc.nextInt();
                        out.writeInt(a1);
                        out.writeInt(a2);
                        System.out.println("UCLN của 2 số trên là " + in.readInt());
                        System.out.println("BCNN của 2 số trên là " + in.readInt());
                        break;
                    case 4:
                        System.out.println("Nhập vào 1 chuỗi: ");
                        sc.nextLine();
                        String s1 = sc.nextLine();
                        out.writeUTF(s1);
                        System.out.println("Chuỗi đảo của chuỗi trên là: " + in.readUTF());
                        break;
                    case 5:
                        System.out.println("Nhập vào 1 chuỗi: ");
                        sc.nextLine();
                        String s2 = sc.nextLine();
                        out.writeUTF(s2);
                        System.out.println(in.readUTF());
                        System.out.println(in.readUTF());
                        break;
                    case 6:
                        break;
                }
                if (choose == 6) {
                    break;
                }

            }
            in.close();
            out.close();
            client.close();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client((Inet4Address) Inet4Address.getLocalHost(), 6066);
        client.excute();
    }
}
