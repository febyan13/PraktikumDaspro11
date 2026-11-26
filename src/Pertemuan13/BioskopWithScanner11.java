package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner feby = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = feby.nextLine();
            System.out.print("Masukkan baris: ");
            baris = feby.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = feby.nextInt();
            feby.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = feby.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
