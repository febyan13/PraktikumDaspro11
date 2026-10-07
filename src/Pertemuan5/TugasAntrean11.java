package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        int kode;
    
        System.out.print("Masukkan kode: ");
        kode = feby.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Legalisir Ijazah - Loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah - Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT - Loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik - Loket D");
                break;
        
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}
