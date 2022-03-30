/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Chuoi {

    private String s;
    private String rd;
    private String rh;
    private String rt;
    private String rht;
    private String rdt;
    private String rna;

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRht() {
        return rht;
    }

    public void setRht(String rht) {
        this.rht = rht;
    }

    public String getRdt() {
        return rdt;
    }

    public void setRdt(String rdt) {
        this.rdt = rdt;
    }

    public String getRna() {
        return rna;
    }

    public void setRna(String rna) {
        this.rna = rna;
    }

    public Chuoi() {
    }

    public Chuoi(String s) {
        this.s = s;
        daoChuoi();
        inHoa();
        inThuong();
        daoHoaThuong();
        demTu();
        nguyenAm();
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một chuỗi cần đảo ngược:   ");
        System.out.println("s: ");
        s = sc.nextLine();
    }

    void daoChuoi() {
        StringBuffer stringBuffer = new StringBuffer(s);
//        System.out.println("Chuỗi sau khi đảo là:   " + stringBuffer.reverse().toString());
        rd = stringBuffer.reverse().toString();
    }

    void inHoa() {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        rh = String.valueOf(charArray);
//        System.out.println("Chuỗi sau khi in hoa:   " + r);

    }

    void inThuong() {
//        System.out.println("Chuỗi sau khi in thường:    " + s.toLowerCase());
        rt = s.toLowerCase();
    }

    void daoHoaThuong() {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        rht = String.valueOf(charArray);
//        System.out.println("Chuỗi sau khi đảo hoa thường:   " + r);

    }

    void demTu() {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        int soTuTrongChuoi = stringTokenizer.countTokens();
//        System.out.println("Số từ có trong chuỗi \"" + s + "\" = " + soTuTrongChuoi);
        rdt = String.valueOf(soTuTrongChuoi);
    }

    void nguyenAm() {
        String str = s;
        int vcount = 0, ccount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
        }
//        System.out.println("Số nguyên âm: " + vcount);
        rna = String.valueOf(ccount);
    }

    public void main() {
        nhap();
        daoChuoi();
        inHoa();
        inThuong();
        daoHoaThuong();
        demTu();
        nguyenAm();
    }

}
