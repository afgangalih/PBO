package Percobaan1;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Asep Kusuma";
        m2.alamat = "Bandung, Jawa Barat";
        m2.kelas = "2B";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Asep Jiharto";
        m3.alamat = "Semarang, Jawa Tengah";
        m3.kelas = "2C";


        m1.displayData();
        m2.displayData();
        m3.displayData();
    }
}
