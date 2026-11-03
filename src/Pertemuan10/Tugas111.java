// P=11
// (uji wajib) n 6 + (1) = 7

package Pertemuan10;

import java.util.Scanner;

public class Tugas111 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);
        
        int total=0;

        System.out.print("Masukkan nilai n : ");
        int n = feby.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak : "+total);
        feby.close();
    }
}


