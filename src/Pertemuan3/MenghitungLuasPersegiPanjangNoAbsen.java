package Pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjangNoAbsen {
    public static void main(String[] args) {

        Scanner feby = new Scanner (System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan panjang : ");
        panjang=feby.nextInt();
        System.out.println("Masukkan lebar : ");
        lebar=feby.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas persegi adalah " + luas);
    }
}