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
public class Ktra_so {

    private int s;
    private String snt = "";
    private String scp = "";
    private String shh = "";
    private String sst = "";

    public String getSnt() {
        return snt;
    }

    public void setSnt(String snt) {
        this.snt = snt;
    }

    public String getScp() {
        return scp;
    }

    public void setScp(String scp) {
        this.scp = scp;
    }

    public String getShh() {
        return shh;
    }

    public void setShh(String shh) {
        this.shh = shh;
    }

    public String getSst() {
        return sst;
    }

    public void setSst(String sst) {
        this.sst = sst;
    }

    public Ktra_so(int s) {
        this.s = s;
        check_snt();
        check_cphuong();
        check_hhao();
        check_armstrong();
    }

    public Ktra_so() {
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một số muốn kiểm tra: ");
        System.out.println("s: ");
        s = sc.nextInt();
    }

    void check_snt() {
        if (s < 2) {
//            System.out.println(s + " không phải là số nguyên tố.");
            snt = s + " không phải là số nguyên tố.";
        } else {
            int squareRoot = (int) Math.sqrt(s);
            int a = 1;
            for (int i = 2; i <= squareRoot; i++) {
                if (s % i == 0) {
                    a = 0;
                    break;
                }
            }
            if (a == 0) {
//                System.out.println(s + " không phải là số nguyên tố.");
                snt = s + " không phải là số nguyên tố.";
            } else {
//                System.out.println(s + " là số nguyên tố.");
                snt = s + " là số nguyên tố.";
            }
        }
    }

    void check_cphuong() {
        double sq = Math.sqrt(s);
        if (sq - Math.floor(sq) == 0) {
//            System.out.println(s + " Là số chính phương.");
            scp = s + " là số chính phương.";
        } else {
//            System.out.println(s + " Không phải là số chính phương.");
            scp = s + " không phải là số chính phương.";
        }
    }

    void check_hhao() {
        int sum = 0;
        for (int i = 1; i <= s / 2; i++) {
            if (s % i == 0) {
                sum += i;
            }
        }
        if (sum == s) {
//            System.out.println(s + " là số hoàn hảo.");
            shh = s + " là số hoàn hảo.";
        } else {
//            System.out.println(s + " không phải là số hoàn hảo.");
            shh = s + " không phải là số hoàn hảo.";
        }
    }

    void check_armstrong() {
        int originalNumber, remainder, result = 0;
        originalNumber = s;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (result == s) {
//            System.out.println(s + " là số Armstrong.");
            sst = s + " là số Armstrong.";
        } else {
//            System.out.println(s + "là số Armstrong.");
            sst = s + " không phải là số Armstrong.";
        }
    }

    public void main() {
        nhap();
        check_snt();
        check_cphuong();
        check_hhao();
        check_armstrong();
    }

}
