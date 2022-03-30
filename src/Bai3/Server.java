/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

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

    private void excute() {
        try {
            System.out.println("Server is listening...");

            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                out.writeUTF(menu());
                int choose = in.readInt();

                switch (choose) {
                    case 1:
                        Ktra_so k = new Ktra_so(in.readInt());
                        out.writeUTF(k.getSnt());
                        out.writeUTF(k.getScp());
                        out.writeUTF(k.getShh());
                        out.writeUTF(k.getSst());

                        break;
                    case 2:
                        TongTichChuso t = new TongTichChuso(in.readInt());
                        out.writeInt(t.getTong());
                        out.writeInt(t.getTich());
                        break;
                    case 3:
                        UCLN_BCNN uc = new UCLN_BCNN(in.readInt(),in.readInt());
                        out.writeInt(uc.getUcln());
                        out.writeInt(uc.getBcnn());
                        break;
                    case 4:
                        DaoChuoi d = new DaoChuoi(in.readUTF());
                        out.writeUTF(d.getR());
                        break;
                    case 5:
                        Chuoi c = new Chuoi(in.readUTF());
                        out.writeUTF(c.getRi());
                        out.writeUTF(c.getRdl());
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
            server.close();
        } catch (IOException e) {
        }
    }

    private String menu() {
        String menu = "\n-----------------------------------------\n"
                + "1. Kiểm tra số nguyên tố, chính phương, hoàn hảo, amstrong\n"
                + "2. Tính tổng tích các chữ số\n"
                + "3. Tính ước chung lớn nhất và bội chung nhỏ nhất của 2 số\n"
                + "4. In chuỗi đảo của chuổi đã cho\n"
                + "5. In chuỗi, đếm kí tự\n"
                + "6. Thoát\n"
                + "Chọn số: ";
        return menu;
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(6066);
        server.excute();
    }

}
