package Percobaan2;
public class Barang {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() {
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Harga K\t: " + hargaKotor);
        System.out.println("Diskon\t: " + diskon);
    }

}