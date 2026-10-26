package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        
        int kopi,teh,roti,totalHarga;
        String namaPelanggan;
        int hargaKopi=11000,hargaTeh=8000,hargaRoti=20000;
        
    do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = feby.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi = feby.nextInt();
        System.out.print("Jumlah teh: ");
        teh = feby.nextInt();
        System.out.print("Jumlah roti: ");
        roti = feby.nextInt();
        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        feby.nextLine();
    } while (true);

    System.out.println("Semua transaksi selesai.");

    }
}