// P=11
// (baris, kolom) uji ke-1 = 4, 6
// (baris, kolom) uji ke-2 = 7, 4

package Pertemuan10;

import java.util.Scanner;

public class Rectangle11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = feby.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = feby.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        feby.close();
    }
}
