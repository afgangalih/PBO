import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
       
        Pegawai ani = new Pegawai("1234", " dr. Ani");
        Pegawai bagus = new Pegawai("4567", " dr. Bagus");

        Pegawai desin = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("3439283", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desin);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 12), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}