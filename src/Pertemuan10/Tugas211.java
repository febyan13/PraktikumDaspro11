// P=11
// (uji wajib) n 5 + (3) = 8

package Pertemuan10;

import java.util.Scanner;

public class Tugas211 {
    public static void main(String[] args) {

        Scanner feby = new Scanner(System.in);
        int hasil;
        int i=0;
        int n;
        int jumlah=0;

       do {
        System.out.print("Masukkan nilai n : ");
        n = feby.nextInt();
        if (n<3) {
            System.out.println("Nilai n minimal 3");
            i--;
        }
        i++;
       } while (i<1);

       for (int j = 1; j <= n; j++) {
        for (int j2 = 1; j2 <= n; j2++) {
            hasil=j*j2;
            System.out.printf("%4d",hasil);
            jumlah=jumlah+hasil;
        }
        System.out.println();
       }

       System.out.println("Jumlah seluruh angka: "+jumlah);
        feby.close();
    }
}