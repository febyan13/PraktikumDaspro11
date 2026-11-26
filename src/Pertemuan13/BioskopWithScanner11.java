package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner feby = new Scanner(System.in);
        Scanner febyline = new Scanner(System.in);
        int baris, kolom,menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = feby.nextInt();


            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = febyline.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = feby.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = feby.nextInt();

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = febyline.nextLine();

                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 3);

    }
}
