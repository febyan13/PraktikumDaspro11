package Pertemuan7;

import java.util.Scanner;

public class StudiKasus211 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        String namaMahasiswa;
        String kegiatan;
        String statusPendanaan;
        int junmlahDokumem,peringkat,status,kurang;

        System.out.print("Nama mahasiswa  : ");
        namaMahasiswa=feby.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        kegiatan=feby.nextLine();
        System.out.print("Jumlah dokumen  : ");
        junmlahDokumem=feby.nextInt();
        
        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            peringkat=feby.nextInt();
            if (peringkat<=3 && peringkat>0) {
                if (junmlahDokumem==4) {
                    statusPendanaan= "Selamat! Dana penghargaan diberikan.";
                } else {
                    kurang=4-junmlahDokumem;
                    statusPendanaan= "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                statusPendanaan=("Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
    }
}
