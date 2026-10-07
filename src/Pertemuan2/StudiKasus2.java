package Pertemuan2;

import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lebar;
        int panjang;
        int diameter;
        int sisi;
        int luasPersegiPanjang,luasPersegi;
        double luasLing,luasTanah;

        System.out.println("Luas tanah Kesleuruhan ");
        System.out.print("Lebar : ");
        lebar = sc.nextInt();
        System.out.print("Panjang : ");
        panjang = sc.nextInt();
        System.out.println("Luas kolam ikan  ");
        System.out.print("Diameter : ");
        diameter = sc.nextInt();
        System.out.println("Luas taman bunga ");
        System.out.print("Sisi : ");
        sisi = sc.nextInt();

        luasPersegiPanjang = panjang * lebar;
        luasPersegi = sisi * sisi;
        luasLing = 3.14 * diameter * diameter / 4;
        luasTanah = luasPersegiPanjang - luasPersegi - luasLing;
        
        System.out.println("Luas tanah yang tidak digunakan : "+luasTanah);
    }
}