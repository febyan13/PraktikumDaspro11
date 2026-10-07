package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan11 {
    public static void main(String[] args) {
         
        Scanner feby = new Scanner(System.in);

        int jumlahSks;

        System.out.print("Masukkan jumlah SKS : ");
        jumlahSks=feby.nextInt();

        if (jumlahSks>24) {
            System.out.println("KRS valid");
        } else {
            System.out.println("Melebihi batas");
        }

    }
}
