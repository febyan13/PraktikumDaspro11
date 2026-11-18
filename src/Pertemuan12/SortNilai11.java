// Percobaan 4 Bagian B 
// (uji wajib tambahan)
// elemen dasar array (B) 31
// {31, 46, 23, 61, 11, 36}

package Pertemuan12;

import java.util.Arrays;

public class SortNilai11 {
    public static void main(String[] args) {
        
    int[] nilai = {31, 46, 23, 61, 11, 36};
    for (int i = 0; i < nilai.length - 1; i++) {
        for (int j = 0; j < nilai.length - 1 - i; j++) {
            if (nilai[j] > nilai[j + 1]) {
                int temp = nilai[j];
                nilai[j] = nilai[j + 1];
                nilai[j + 1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(nilai));
    }
}
