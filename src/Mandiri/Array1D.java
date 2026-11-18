package Mandiri;

public class Array1D {
    public static void main(String[] args) {

        
        double tugas[] = {50, 70, 90.5, 95.5};
        String namaMhs[] = {"hani", "ani", "dina", "doni"};

        double total=0;
        double max=tugas[0];
        String namamax=namaMhs[0];
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.println(namaMhs[i] + " : " + tugas[i]);
            total += tugas[i];
            if (tugas[i]>max) {
                max=tugas[i];
                namamax=namaMhs[i];
            }
        }
        System.out.println("nilai terbesar : "+max);
        System.out.println("nama terbesar : "+ namamax);
        double rata = total / tugas.length;
        System.out.println("rata rata : " + rata);

    }
}