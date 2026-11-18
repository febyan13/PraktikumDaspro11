// Percobaan 4 Bagian A 
// (uji wajib tambahan)
// key 61

package Pertemuan12;

import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        
        System.out.print("Banyak elemen: ");
        int n = feby.nextInt();
        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            nilai[i] = feby.nextInt();
        }
        System.out.print("Key yang dicari: ");
        int key = feby.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
             System.out.println("Nilai yang dicari tidak ditemukan: " + key + " tidak ada dalam array " + Arrays.toString(nilai));
        }
    }
}
