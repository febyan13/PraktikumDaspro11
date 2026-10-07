package Pertemuan4;

import java.util.Scanner;

public class Koperasi_11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);

        int hargaAlatTulis = 12000;
        int biayaModal = 1352500;
        int anggota = 8;
        int paketTerjual;
        double laba,bagianAnggota,pendapatan,kas;

        System.out.print("Paket Terjual:");
        paketTerjual=feby.nextInt();

        pendapatan=hargaAlatTulis*paketTerjual;
        double pendapatanSeminggu=pendapatan*6;
        laba=biayaModal-pendapatan;
        double labaSeminggu=laba*6;
        bagianAnggota=labaSeminggu/anggota;
        double sisaLaba=labaSeminggu-bagianAnggota;
        kas=labaSeminggu-sisaLaba;

        System.out.println("Pendapatan perhari:"+(int)pendapatan);
        System.out.println("Pendapatan Seminggu:"+(int)pendapatanSeminggu);
        System.out.println("Laba perhari:"+(int)laba);
        System.out.println("Laba perminggu:"+(int)labaSeminggu);
        System.out.println("Bagian Anggota:"+bagianAnggota);
        System.out.println("Sisa kas:"+(int)kas);
        
    }
    
}
