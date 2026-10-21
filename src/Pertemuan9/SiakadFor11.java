package Pertemuan9;

import java.util.Scanner;

public class SiakadFor11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        
        int lulus=0,tidakLulus=0;
        double nilai,tertinggi = 0,terendah = 100;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswake-" + i + ": ");
            nilai = feby.nextDouble();
            if (nilai>tertinggi) {
                tertinggi=nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            }
            if (nilai>=55) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus " + tidakLulus);

    }
}
