package Mandiri;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
    
        Scanner feby = new Scanner(System.in);

            String nama;
            int gajiPokok,jmlAnak;
            int tunjangan = 100000,transportasi=600000,makan=400000;
            double bonusKinerja=0.05,pajak=0.1;

            nama=feby.next();
            gajiPokok=feby.nextInt();
            jmlAnak=feby.nextInt();

            double bonusAnak=jmlAnak*tunjangan;
            double potonganGaji=gajiPokok*pajak;
            double bonus=bonusKinerja*gajiPokok;
            double total=bonusAnak+gajiPokok+transportasi+makan+bonus-potonganGaji;
            int totalInt=(int)total;

            System.out.println(nama);
            System.out.println(totalInt);

    }
}
