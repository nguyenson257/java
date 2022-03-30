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
public class UCLN_BCNN {

    private int a, b;    
    private int ucln = 1, bcnn;

    public int getUcln() {
        return ucln;
    }

    public void setUcln(int ucln) {
        this.ucln = ucln;
    }

    public int getBcnn() {
        return bcnn;
    }

    public void setBcnn(int bcnn) {
        this.bcnn = bcnn;
    }


    public UCLN_BCNN() {
    }

    public UCLN_BCNN(int a, int b) {
        this.a = a;
        this.b = b;
        
        UCLN();
        BCNN();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số: ");
        System.out.println("a: ");
        a = sc.nextInt();
        System.out.println("b: ");
        b = sc.nextInt();
    }

    void UCLN() {
        int num1 = a, num2 = b, gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ucln = i;
            }
        }
//        System.out.printf("Ước chung lớn nhất của %d và %d là: %d\n", num1, num2, ucln);
    }

    void BCNN() {
        int num1 = a, num2 = b, gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        bcnn = (a * b) / gcd;
//        System.out.printf("Bội chung nhỏ nhất của %d và %d là: %d\n", num1, num2, bcnn);
    }

    public void main() {
        nhap();
        UCLN();
        BCNN();
    }
}
