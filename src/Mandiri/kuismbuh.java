package Mandiri;

import java.util.Scanner;

public class kuismbuh {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);
        int toko,barang,pelanggan;
        int totalseluruh=0;
        int minbayar=-1;
        int tokoTerbanyak=0;

        System.out.print("Jumlah Toko: ");
        toko=feby.nextInt();

        for (int i = 1; i <= toko; i++) {
            System.out.print("jumlah pelanggan toko-"+i+": ");
            pelanggan=feby.nextInt();
            int totalBarang=0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("jumlah barang pelanggan_"+j+": ");
                barang=feby.nextInt();
                totalBarang+=barang;
                totalseluruh+=totalBarang;
            }
            System.out.println("Toko " + i + " - pelanggan: " + pelanggan + ", total barang: " + totalBarang);
            if (totalBarang>minbayar) {
                minbayar=totalBarang;
                tokoTerbanyak=i;
            }
        }

        System.out.println("Total barang seluruh toko"+totalseluruh);
        System.out.println("Toko dengan barang terbayak"+tokoTerbanyak);
        
        feby.close();
    }
}
