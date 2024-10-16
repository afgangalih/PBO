package jobsheet03;

public class Anggota {

    private String noKtp;
    private String nama;
    private int limitPinjaman, jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }


    public void pinjam(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal pinjaman harus lebih dari 0");
        } else if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, pinjaman melebihi limit pinjaman");
        } else {
            jumlahPinjaman += nominal;

        }
    }

    public void angsur(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal angsuran harus lebih dari 0");

            
        } else if (nominal < jumlahPinjaman * 0.1) {
         System.out.println("Maaf, angsuran minimal 10% dari pinjaman");   
        } else {
            jumlahPinjaman -= nominal;
        }
    }

    public String getKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

}
