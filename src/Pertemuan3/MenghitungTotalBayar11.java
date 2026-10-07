package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);
        
        double harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;
        
        System.out.println("Masukkan harga : ");
        harga = feby.nextDouble();
        
        potongan = diskon * harga;
        
        jml_bayar = harga - potongan;
        
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

        feby.close();
        
    }
}
