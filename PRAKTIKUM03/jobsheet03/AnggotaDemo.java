package jobsheet03;

public class AnggotaDemo {
    public static void main(String[] args) {
        
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota 1: " + anggota1.getNama());
        System.out.println("Limit pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000...");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 100000...");
        anggota1.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
    }
}
