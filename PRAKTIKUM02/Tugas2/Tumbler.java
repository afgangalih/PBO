package Tugas2;

public class Tumbler {
    
    public String merek, warna, bahan;
    public float kapasitas;

    

    public void tampilInfo() {
        System.out.println("\n-- INFORMASI TUMBLER --");
        System.out.println("Merek\t\t: " + merek);
        System.out.println("Warna\t\t: " + warna);
        System.out.println("Bahan\t\t: " + bahan);
        System.out.println("Kapasitas\t: " + kapasitas);
    }

    public boolean bukaTumbler() {
        System.out.println("Tumbler telah terbuka!");
        return true;
    }

    public boolean tutupTumbler() {
        System.out.println("Tumbler telah ditutup!");   
        return true;
    }

    public float dayaTampung(float isi) {
        if (isi > kapasitas) {
            System.out.println("Isi tumbler melebihi kapasitas!");
            return 0;
        } else {
            System.out.println("Tumbler berhasil diisi!");
            return isi;
        }
    }
}
