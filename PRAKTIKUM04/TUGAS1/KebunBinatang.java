package TUGAS1;

import java.util.ArrayList;

public class KebunBinatang {
    private String nama;
    private ArrayList<Hewan> daftarHewan;
    private ArrayList<Kandang> daftarKandang;
    private boolean headerDitampilkan = false;

    public void namaKebunBinatang() {
        System.out.println("--- Ahlan Wa Sahlan Di " + this.getNama() + " ---");
    }

    public KebunBinatang(String nama) {
        this.nama = nama;
        this.daftarHewan = new ArrayList<Hewan>();
        this.daftarKandang = new ArrayList<Kandang>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahHewanKeKB(Hewan hewan) {
        daftarHewan.add(hewan);
        System.out.println(hewan.getNama() + " berhasil ditambahkan kebun binatang");
    }

    public void tambahKandang(Kandang kandang) {
     
        if (!headerDitampilkan) {
            System.out.println("\n=============== Informasi Penambahan Kandang ==============");
            headerDitampilkan = true; // Set flag setelah menampilkan header
        }

        // Menambahkan kandang
        daftarKandang.add(kandang);
        System.out.println("Kandang No-" + kandang.getNomor() + " ditambahkan ke kebun binatang");
    }

    // Panggil metode ini setelah semua kandang ditambahkan
    public void tampilkanFooterKandang() {
      
        if (headerDitampilkan) {
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void lihatDaftarHewan() {
        for (Hewan hw : daftarHewan) {
            System.out.println(hw.getNama() + " " + hw.getJenis() + " umur " + hw.getUmur() + " tahun");
        }
    }
}
