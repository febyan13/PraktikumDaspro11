// Percobaan 1
// (uji wajib
// tambahan)
// bil[0], bil[1], bil[2], bil[3] 
// 11 ; 19 ; −5 ; 31

package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan11 {
    public static void main(String[] args) {
     
        int[] bil = {11, 19, -5, 31};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
        System.out.println(nilai);
        }
        
        System.out.println(Arrays.toString(bil));

    }
}
