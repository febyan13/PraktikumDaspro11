// P = 11
// 18000
// 28000
// 13000
// 9
// 19

package Pertemuan8;

import java.util.Scanner;

public class KolamRenang_11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        int usia,totHarga,tiket;

        System.out.print("Masukkan usia (1=Anak, 2=Dewasa, 3=Lansia) : ");
        usia=feby.nextInt();
        System.out.print("Jumlah tiket : ");
        tiket=feby.nextInt();

        switch (usia) {
            case 1:
                totHarga = 18000;
                break;
                
            case 2:
                 totHarga = 28000;
                 break;
                 
            case 3:
                 totHarga = 13000;
                break;
        
            default:
                System.out.println("Kode tidak valid");
                totHarga=0;
                return;
                break;
        }

        if (tiket>0 && tiket<=9) {
            System.out.println ("Harga : "+totHarga);
        } else if (tiket<9) {
            int diskon=(tiket*2000)-totHarga;
            int totdiskon=tiket*totHarga-diskon;

            System.out.println();
        } else {
            
        }

    }
}
