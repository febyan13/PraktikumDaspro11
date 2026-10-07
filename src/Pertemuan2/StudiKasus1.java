package Pertemuan2;

import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gajiPokok=5000000;
        double tunjangan=100000;
        int jmlAnak=4;
        double potonganGaji=0.1;
        double gajiBersih,potonganPensiun,totalTunjangan;

        System.out.println("Tunjangan anak perbulan : "+tunjangan);
        System.out.println("Jumlah anak : "+jmlAnak);
        System.out.println("Gaji pokok : "+gajiPokok);
        
        totalTunjangan = tunjangan * jmlAnak;
        potonganPensiun = gajiPokok * potonganGaji;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;
        
        System.out.println("Gaji bersih :  "+gajiBersih);
    }
    
}
