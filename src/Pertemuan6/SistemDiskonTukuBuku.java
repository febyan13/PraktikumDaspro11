package Pertemuan6;

import java.util.Scanner;

public class SistemDiskonTukuBuku {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        String jenis;
        int jumlah,harga,diskon,bayar;
        double persen,total;
    
        System.out.print("Jenis buku: ");
        jenis=feby.nextLine();
        System.out.print("Jumlah buku: ");
        jumlah=feby.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            persen=0.09;
            if (jumlah>3) {
                total=persen+0.02;
                System.out.print("Jumlah diskon adalah: "+total*100);
            } else {
                total=persen+0;
                System.out.print("Jumlah diskon adalah: "+total*100);
            }
        } else {
            if (jenis.equalsIgnoreCase("novel")) {
                persen=0.08;
                if (jumlah>4) {
                    total=persen+0.02;
                    System.out.print("Jumlah diskon adalah: "+total*100);
                } else if (jumlah<=4){
                    total=persen+0.01;
                    System.out.print("Jumlah diskon adalah: "+total*100);
                }
            } else {
                if (jumlah>4) {
                    total=0.06;
                    System.out.print("Jumlah diskon adalah: "+total*100);
                } else {
                    total=0;
                    System.out.print("Jumlah diskon adalah: "+(int)total);
                }
            }
        
        }
    
    }
}
