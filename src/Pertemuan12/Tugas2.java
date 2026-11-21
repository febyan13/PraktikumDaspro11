// p = 11
// Tugas 2 
// (uji wajib) 
// jumlah item dipesan 5
// Tugas 2 
// (uji wajib) 
// indeks menu yang wajib dipesan 4

package Pertemuan12;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner feby = new Scanner(System.in);
        Scanner febyline = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Cari menu: ");
        String cari = febyline.nextLine();
        int idxCari = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                idxCari = i;
                break;
            }
        }
        if (idxCari != -1) {
            System.out.println("Harga " + menu[idxCari] + ": Rp " + harga[idxCari]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        System.out.print("Jumlah item yang dipesan: ");
        int jumlah = feby.nextInt();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Pilih menu ke-" + (i + 1) + ": ");
                String pilihan = febyline.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihan)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak valid, silakan pilih ulang.");
                }
            }
        }

        System.out.println("\n========== DAFTAR PESANAN ==========");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-2d. %-18s Rp %,8d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("------------------------------------");
        System.out.printf("Total biaya: Rp %,d%n", totalBiaya);
        System.out.println("====================================");
        
        feby.close();
    }
}
