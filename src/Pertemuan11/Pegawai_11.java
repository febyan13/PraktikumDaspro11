package Pertemuan11;

import java.util.Scanner;

public class Pegawai_11 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        Scanner febyline = new Scanner(System.in);
        String nama,tambahPegawai;
        int rentang=-1;
        int totalJamkerja=0;
        int lembur=0;
        int tidaklembur=0;
        int jumlahPegawai=0;

        int i=1;
        do {
            System.out.print("Nama Pegawai: ");
            nama=febyline.nextLine();
            int terbanyak=0;
            for (int j = 1; j <= 5; j++) {
                int jamKerja=0;
                System.out.print("Jam kerja hari "+j+": ");
                jamKerja=feby.nextInt();
                totalJamkerja+=jamKerja;
                if (jamKerja>=0 && jamKerja>=12) {
                    System.out.println("Jam tisak valid,ulangi!");
                    j--;
                }
                
                if (jamKerja>rentang) {
                    rentang=jamKerja;
                    terbanyak+=rentang;
                }
            }
            System.out.println("jam kerja terbanyak: "+terbanyak);
            jumlahPegawai++;
            if (totalJamkerja>40) {
                System.out.println("Status: Lembur");
                lembur++;
            } else {
                System.out.println("Status : Tidak Lembur" );
                tidaklembur++;
            }
            System.out.print("Tambah Pegawai : ");
            tambahPegawai=febyline.nextLine();
            System.out.println();
        } while (tambahPegawai.equalsIgnoreCase("y"));
        
        System.out.println("jumlah Pegawai: "+jumlahPegawai);
        System.out.println("jumlah Lembur: "+lembur);
        System.out.println("jumlah tidak lembur: "+tidaklembur);
        feby.close();
    }
}