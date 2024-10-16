package Tugas1;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();

        pp.panjang = 10;
        pp.lebar = 5;

        pp.displayInfo();

        System.out.println("Luas\t\t: " + pp.hitungLuas());
        System.out.println("Hitung K\t : " + pp.hitungKeliling());
    }
}
