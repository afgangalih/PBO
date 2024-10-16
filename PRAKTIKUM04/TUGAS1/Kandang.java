package TUGAS1;

import java.util.ArrayList;

public class Kandang {

    private int nomor, kapasitas;
    private ArrayList<Hewan> daftarHewan;

    public Kandang(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.kapasitas = kapasitas;
        this.daftarHewan = new ArrayList<Hewan>();
    }

    public int getNomor() {
        return nomor;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void tambahHewanKandang(Hewan hewan) {
        
        if (daftarHewan.isEmpty()) {
            System.out.println("\n=== Penambahan Hewan Ke Kandang ===");
        }
        
        if (daftarHewan.size() < kapasitas) {
            daftarHewan.add(hewan);
            System.out.println("Nama Hewan\t: " + hewan.getNama());
            System.out.println("Jenis Hewan\t: " + hewan.getJenis());
            System.out.println("Status\t\t: Berhasil ditambahkan");
            System.out.println("Kandang No-\t: " + nomor);
            System.out.println(); 
        } else {
            System.out.println("Nama Hewan   : " + hewan.getNama());
            System.out.println("Jenis Hewan  : " + hewan.getJenis());
            System.out.println("Status       : Kandang penuh, tidak bisa ditambahkan");
            System.out.println(); 
        }
        
       
        if (daftarHewan.size() == kapasitas) {
            System.out.println("------------------------------------");
        }
    }
    

    public void lihatDaftarHewanKandang() {
        System.out.println("\n=== Daftar Hewan di Kandang " + nomor + " ===");
        for (Hewan h : daftarHewan) {
            System.out.println("\nNama Hewan\t: " + h.getNama());
            System.out.println("Jenis\t\t: " + h.getJenis());
            System.out.println("Umur\t\t: " + h.getUmur() + " tahun");
        }
        System.out.println("----------------------------------");
    }
    
    

}