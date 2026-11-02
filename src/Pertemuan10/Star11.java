// p = 11
// n (uji ke-1) 3 + 1 = 4
// n (uji ke-2) 9 + 1 = 10

package Pertemuan10;

import java.util.Scanner;

public class Star11 {
    public static void main(String[] args) {
        Scanner feby = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = feby.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        feby.close();
    }
}