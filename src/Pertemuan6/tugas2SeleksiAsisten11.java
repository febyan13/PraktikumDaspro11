package Pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        int nilaiDP,nilaiWawancara;
        boolean statusMahasiswa,kenaSanksi,punyaSertifikat;

        System.out.print("Apakah Anda mahasiswa aktif? (true/false): ");
        statusMahasiswa = feby.nextBoolean();
        System.out.print("Apakah Anda sedang kena sanksi? (true/false): ");
        kenaSanksi = feby.nextBoolean();
        
        if (statusMahasiswa && !kenaSanksi) {
             System.out.print("Masukkan nilai Dasar Pemrograman: ");
             nilaiDP = feby.nextInt();
             System.out.print("Punya sertifikat pemrograman? (true/false): ");
             punyaSertifikat = feby.nextBoolean();

            if (nilaiDP >= 75 || punyaSertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = feby.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Lolos! Anda diterima jadi asisten.");

                } else {
                    System.out.println("Gagal di tahap wawancara.");
                }
                
            } else {
                System.out.println("Gagal! Nilai pemrograman kurang dan tidak punya sertifikat.");
            }
            
        } else {
            System.out.println("Gagal! Anda tidak aktif atau sedang kena sanksi.");
        }
    }
}
