package Pertemuan3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);

        double x,totalBiaya;

        System.out.println("Lembar : ");
        x=feby.nextInt();

        totalBiaya=(x*500)+5000;

        System.out.println(" total biaya yang harus dibayar mahasiswa : "+totalBiaya);

    }
}
