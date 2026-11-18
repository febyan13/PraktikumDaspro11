// Percobaan 3 
// (uji wajib tambahan)
// salah satu nilai yang diinput 41

package Pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
 
        Scanner feby = new Scanner(System.in);

        System.out.print("Banyak mahasiswa: ");
        int n = feby.nextInt();
        int[] nilaiMhs = new int[n];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = feby.nextInt();
            total += nilaiMhs[i];
        }
        
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String kelas;
        if (rata2>=85) {
            kelas="SANGAT BAIK";
        } else if (rata2>=70) {
            kelas="BAIK";
        } else {
            kelas="PERLU PENDAMPINGAN";
        } 

        System.out.println("Predikat kelas: "+kelas);

        int lulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) lulus++;
        }
        System.out.println("Jumlah mahasiswa lulus: " + lulus);

        feby.close();
    }
}