// Percobaan 2 
// (uji wajib tambahan)
// salah satu nilai yang diinput 71

package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner feby = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = feby.nextInt();
        }

        int j = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + j + ": " + nilai + " (" + status + ")");
            j++;
        }

        feby.close();
    }
}
