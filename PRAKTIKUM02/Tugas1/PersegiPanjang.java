package Tugas1;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void displayInfo() {
        System.out.println("Panjang\t\t: " + panjang);
        System.out.println("Lebar\t\t: " + lebar);
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling () {
        return 2 * (panjang + lebar);
    }
}
