// P=11
// Tarif parkir mobil = 3750
// Tarif parkir motor = 2750

package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        
        int jenis,durasi,total=0;

        System.out.print("Jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
        jenis = feby.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi parkir (jam): ");
                durasi = feby.nextInt();
            if (jenis == 1) {
                    total += durasi * 3750;
                } else {
                    total += durasi * 2750;
                }
            }
            
            System.out.print("Jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = feby.nextInt();

        }
        
        System.out.println("Total pembayaran parkir: Rp " + total);
        }
    }