package Percobaan1;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public String kelas;

    public void displayData() {
        System.out.println("\n--- INFORMASI MAHASISWA ---");
        System.out.println("NIM\t : " + nim);
        System.out.println("Nama\t : " + nama);
        System.out.println("Kelas\t : " + kelas);
        System.out.println("Alamat\t : " + alamat);
    }
}
