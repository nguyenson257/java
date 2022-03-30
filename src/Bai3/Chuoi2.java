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
public class Chuoi2 {

    private String s;
    private String rdc;
    private String rkt;

    public String getRdc() {
        return rdc;
    }

    public void setRdc(String rdc) {
        this.rdc = rdc;
    }

    public String getRkt() {
        return rkt;
    }

    public void setRkt(String rkt) {
        this.rkt = rkt;
    }

    public Chuoi2() {
    }

    public Chuoi2(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một chuỗi:   ");
        System.out.println("s: ");
        s = sc.nextLine();
    }

    void demchu() {
        String str = s;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    void DemKyTu() {
        String str = s;
        str = str.toLowerCase();
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            counter[str.charAt(i)]++;
        }
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j]) {
                    flag++;
                }
            }
            if (flag == 1) {
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
            }
        }
    }

    public void main() {
        nhap();
        demchu();
        DemKyTu();
    }

}
