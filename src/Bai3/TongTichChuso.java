/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TongTichChuso {

    private int s;    
    private int tong = 0;
    private int tich = 1;

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public int getTich() {
        return tich;
    }

    public void setTich(int tich) {
        this.tich = tich;
    }


    public TongTichChuso(int s) {
        this.s = s;
        tong();
        tich();
    }

    public TongTichChuso() {
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một số nguyên dương muốn tính: ");
        System.out.println("s: ");
        s = sc.nextInt();
    }

    void tong() {
        int n = s, soDu;
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

//        System.out.println("Tổng các chữ số = " + tong);
    }

    void tich() {
        int n = s, soDu;
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tich *= soDu;
        }

//        System.out.println("Tích các chữ số = " + tich);
    }

    public void main() {
        nhap();
        tong();
        tich();
    }
}
