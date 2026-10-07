package Mandiri;

import java.util.Scanner;

public class studiKasus {

    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);

        String namaMahasiswa;
        int lembar;
        double biaya = 500;
        double biayaPenjilidan = 2000;
        double diskon = 0.1;

        System.out.println("Nama : ");
        namaMahasiswa=feby.next();
        lembar=feby.nextInt();

        Double biayaPerlembar=biaya*lembar;
        Double setelahDiskon=biayaPerlembar*diskon;
        Double total=setelahDiskon+biayaPenjilidan;

        System.out.println(namaMahasiswa);
        System.out.println(total);
    }
}