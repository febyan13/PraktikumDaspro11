// p=11
// Tugas 1 
// (uji wajib) 
// jumlah nilai mahasiswa 5 
// Tugas 1 
// (uji wajib) 
// salah satu nilai yang diinput 11

package Pertemuan12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
       
        Scanner feby = new Scanner(System.in);
        
        int n;
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        n = feby.nextInt();

        int nilai[]=new int[n];
        int total=0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = feby.nextInt();
            total+=nilai[i];
            int rentang = nilai[0];
            }
        
        int tertinggi=nilai[0];
        int terendah=nilai[0];
        for (int i = 0 ; i < nilai.length; i++) {
            if (terendah>nilai[i]) {
                terendah=nilai[i];
            }
            if (tertinggi<nilai[i]) {
                tertinggi=nilai[i];
            }
        }

        double rata;
        rata=(double) total/nilai.length;
        System.out.println("Rata-rata: "+rata);
        System.out.println("nilai tertinggi: "+tertinggi);
        System.out.println("nilai terendah: "+terendah);
        String status;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i]>70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+": "+nilai[i]+" Status: "+status);
        }

        feby.close();
    }
}