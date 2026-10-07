package Pertemuan6;

import  java.util.Scanner;

public class nestedAksesLab11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif (True/False): ");
        mahasiswaAktif=feby.nextBoolean();
        System.out.print("Apakah sedang disanksi: (True/False): ");
        sedangDisanksi=feby.nextBoolean();
        System.out.print("Apakah punya izin dosen: (True/False): ");
        punyaIzinDosen=feby.nextBoolean();
        System.out.print("Apakah asisten Lab: (True/False): ");
        asistenLab=feby.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                 System.out.println("Akses Laboratorium diberikan");                
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

    }
}
