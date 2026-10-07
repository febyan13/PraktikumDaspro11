package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        double x,y,z;
        double sisa,cicilanPokok,bunga,totalCicilan;

        System.out.println("Masukkan harga : ");
        x=feby.nextDouble();
        System.out.println("Masukkan uang muka : ");
        y=feby.nextDouble();
        System.out.println("Masukkan bulan : ");
        z=feby.nextDouble();
        
        sisa=x-y;
        bunga=0.02*sisa;
        cicilanPokok=sisa/z;
        totalCicilan=cicilanPokok+bunga;
        
        System.out.println("berapakah jumlah cicilan yang harus dibayar setiap bulan? :"+totalCicilan);
        System.out.println("\nberapakah jumlah cicilan yang harus dibayar setiap bulan? :"+totalCicilan);
    }
}
