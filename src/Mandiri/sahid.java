package Mandiri;

import java.util.Scanner;

public class sahid {
  public static void main(String[] args) {

    Scanner sahid = new Scanner(System.in);
    
    int pembayaran,pin,debit;
    String nama;


    System.out.print("Masukkan nama : ");
    nama=sahid.nextLine().trim();
    System.out.print("Metode Pembayaran (QRIS/DANA/GOPAY) ; ");
    pembayaran=sahid.nextInt();

    switch (pembayaran) {
        case 1:
            System.out.println("Nama sahid");
            break;
        case 2:
            System.out.print("Masukkan pin: ");
            pin=sahid.nextInt();
            if (pin==1234 || pin==313) {
                System.out.println("PIN SUKSES");
            } else {
                System.out.println("pin salah");
            }
            break;
        case 3:
            System.out.println("MASUKAN PIN");
            pin=sahid.nextInt();
            if (pin==354) {
                System.out.println("PIN SUKSES");
            } else {
                System.out.println("TRANSAKSI DI TOLAK");
            }
            break;
        
        default:
            System.out.println("kode tidak valid");
            break;
    }

  }
}  
