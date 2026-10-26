package Pertemuan9;

import java.util.Scanner;

import Mandiri.studiKasus;

public class Bioskop11 {
    public static void main(String[] args) {
        Scanner feby = new Scanner(System.in);
        Scanner febystring = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int hargaKotor;
        double totalTiket = 0;
        double totalPendapatan = 0;
        double hargaBayar;
        double diskon;
        String sehari;

        
        for (int i = 1; i > 0; i++) {
            System.out.print("Jika sudah sehari (sudah/belum): ");
            sehari=febystring.nextLine().trim();
            
            if (sehari.equalsIgnoreCase("sudah")) {
                break;
            }

            System.out.print("Jumlah tiket yang dibeli: ");
            jumlahTiket = feby.nextInt();


            if (jumlahTiket < 0) {
                continue;
            }

            hargaKotor=jumlahTiket*hargaTiket;

            if (jumlahTiket>5) {
                diskon=hargaKotor*0.09;
            }
            else if (jumlahTiket>18) {
                diskon=hargaKotor*0.18;
            } else{
                diskon = 0;
            }

            hargaBayar = hargaKotor - diskon;
            totalTiket = totalTiket + jumlahTiket;
            totalPendapatan = totalPendapatan + hargaBayar;

            System.out.println("Diskon: Rp " + (int)diskon);
            System.out.println("Total pembayaran: Rp " + (int)hargaBayar);

       }
    System.out.println("Total tiket terjual: " + (int)totalTiket);
    System.out.println("Total pendapatan: Rp " + (int)totalPendapatan);
    }
}
