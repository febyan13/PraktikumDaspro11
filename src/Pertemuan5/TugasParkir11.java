package Pertemuan5;

import java.util.Scanner;

public class TugasParkir11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        int lama,tarif;

        System.out.print("Berapa lama: ");
        lama = feby.nextInt();

        if (lama<=2) {
            tarif=2000;
        } else {
            tarif=2000+(lama-2)*1000;
        }
        System.out.println("Total Tarif: "+tarif);
    }
}
