package Pertemuan10;

import java.util.Scanner;

public class PenjualanToko11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);

        int jumlahTerjual,jumlahProduk=3;
        int totalPerproduk=0,jumlahHari=4;
        int totalPenjualan=0;

        int i = 0;
        while (i<jumlahProduk) {

            int j = 0;
            while (j<jumlahHari) {
                
                System.out.print("Masukkan jumlah terjual : ");
                jumlahTerjual=feby.nextInt();

                totalPerproduk=totalPerproduk+jumlahTerjual;

                j++;
            }
            System.out.println("Total perproduk ke-"+(i+1)+" : "+totalPerproduk);
            totalPenjualan=totalPenjualan+totalPerproduk;

            totalPerproduk=0;

            i++;
        }
        System.out.println("Total Penjualan: "+totalPenjualan);
    }
}
