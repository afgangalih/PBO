import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis, nama;
    private ArrayList<Konsultasi> riwayatkonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatkonsultasi = new ArrayList<Konsultasi>();
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        this.riwayatkonsultasi.add(konsultasi);
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis       : " + this.noRekamMedis + "\n";
        info += "Nama                 : " + this.nama + "\n";

        if (!riwayatkonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi   : \n";

            for (Konsultasi konsultasi : riwayatkonsultasi) {
                info += konsultasi.getInfo();
            }

        } else {
            info += "Belum ada riwayat konsultasi";
        }
        info += "\n";

        return info;
    }
}
