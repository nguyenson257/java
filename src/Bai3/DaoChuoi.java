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
public class DaoChuoi {

    private String s;
    private String r;

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public DaoChuoi() {
    }

    public DaoChuoi(String s) {
        this.s = s;
        daochuoi();

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một chuỗi cần đảo ngược: ");
        System.out.println("s: ");
        s = sc.nextLine();
    }

    void daochuoi() {
        StringBuffer stringBuffer = new StringBuffer(s);
//        System.out.println("Chuỗi sau khi đảo là:\n" + stringBuffer.reverse().toString());
        r = stringBuffer.reverse().toString();
    }

    public void main() {
        nhap();
        daochuoi();
    }
}
