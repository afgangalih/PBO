package TUGAS;

import java.util.List;

public class Resep {
    protected String nama;
    protected int waktuMasak;
    protected int porsi;
    protected List<String> bahan;  // Menyimpan daftar bahan2

    // Constructor tanpa parameter
    public Resep() {
        this.nama = "Tidak diketahui";
        this.waktuMasak = 0;
        this.porsi = 0;
        this.bahan = null;
    }

    // Constructor berparameter
    public Resep(String nama, int waktuMasak, int porsi, List<String> bahan) {
        this.nama = nama;
        this.waktuMasak = waktuMasak;
        this.porsi = porsi;
        this.bahan = bahan;
    }

    public void mulaiMemasak() {
        System.out.println("\nMulai memasak " + nama);
        System.out.println("Waktu persiapan: " + waktuMasak + " menit");
        System.out.println("Porsi: " + porsi + " porsi");
        System.out.println("Bahan-bahan yang diperlukan: ");
        for (String b : bahan) {
            System.out.println("- " + b);
        }
    }
}
