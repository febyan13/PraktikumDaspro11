// P=11
// (uji wajib) jumlahToko 2 + (2) = 4

package Pertemuan10;

import java.util.Scanner;

public class Tugas311 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);
        
        int jumlahToko;
        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = feby.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);


        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;

            do {
                System.out.print("Jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = feby.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;

                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = feby.nextInt();

                    if (jumlahBarang < 0) {
                    System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko = totalBarangToko + jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSemuaToko = totalBarangSemuaToko + totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        feby.close();
    }
}