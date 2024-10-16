package Tugas2;

public class TumblerDemo {
    public static void main(String[] args) {
        Tumbler tumbler1 = new Tumbler();
        Tumbler tumbler2 = new Tumbler();

        tumbler1.merek = "DIY Tumbler";
        tumbler1.warna = "Merah";
        tumbler1.bahan = "Plastik";
        tumbler1.kapasitas = 1000;
        tumbler1.tampilInfo();

        tumbler2.merek = "S'Bright Tumbler";
        tumbler2.warna = "Hijau";
        tumbler2.bahan = "Kaca";
        tumbler2.kapasitas = 2000;
        tumbler2.tampilInfo();



        float isi1 = 500;
        float isi2 = 1500;

        // System.out.println("\nIsi tumbler 1 : " + tumbler1.dayaTampung(isi1));
        System.out.println("");

        tumbler1.bukaTumbler();
        System.out.println("Kapasitas tumbler 1: " + tumbler1.kapasitas);
        System.out.println("Isi tumbler 1: " + isi1);
        System.out.println("Hasil dayaTampung: " + tumbler1.dayaTampung(isi1));
        tumbler1.tutupTumbler();
        System.out.println();

        tumbler2.bukaTumbler();
        System.out.println("Kapasitas tumbler2: " + tumbler2.kapasitas);
        System.out.println("Isi tumbler 2: " + isi2);
        System.out.println("Hasil dayaTampung: " + tumbler2.dayaTampung(isi2));

    }
}
