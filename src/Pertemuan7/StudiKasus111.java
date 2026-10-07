package Pertemuan7;

import java.util.Scanner;

public class StudiKasus111 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup,uangBayar;
        int totalHarga,diskon,totalBayar;
        int kembaliann, kurang;
        
        System.out.print("Masukkan jumlah cup\t: ");
        jumlahCup=feby.nextInt();
        System.out.print("Masukkan uang bayar\t: "); 
        uangBayar=feby.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;

        if (totalHarga>=100000) {
            diskon = totalHarga * 10/100;
        } 
            
        totalBayar=totalHarga-diskon;

        System.out.println("Total harga\t\t: "+totalHarga);
        System.out.println("Diskon\t\t\t: "+diskon);
        System.out.println("Total bayar\t\t: "+totalBayar);

        if (uangBayar>=totalBayar) {
            kembaliann=uangBayar-totalBayar;
            System.out.println("Kembalian\t\t: "+kembaliann);
        } else {
            kurang=totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp "+kurang);
        }
    }
}
