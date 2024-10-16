package TUGAS1;

public class Hewan {
    private String nama, jenis;
    private int umur;

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    // public void setNama() {
    //     this.nama = nama;
    // }
    public String getJenis() {
        return jenis;
    }

    public int getUmur() {
        return umur;
    }

    // public String toString() {
        
    //     return "Hewan: " + nama + " | Jenis: " + jenis + " | Umur: " + umur + " tahun";
    // }
}
