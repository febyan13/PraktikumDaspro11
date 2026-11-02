// P=11
// (uji awal,langkah 3) n 2 + (5) = 7

package Pertemuan10;

import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        
        Scanner feby = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = feby.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
        i = n;
        while (i >= 1) {
            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        feby.close();
    }
}
