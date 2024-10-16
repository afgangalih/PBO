public abstract class ResepMakanan {
    protected String nama;
    protected int waktuMasak; // dalam menit
    protected int porsi;
    
    public ResepMakanan(String nama, int waktuMasak, int porsi) {
        this.nama = nama;
        this.waktuMasak = waktuMasak;
        this.porsi = porsi;
    }
    
    // Method abstract yang harus diimplementasikan oleh child classes
    public abstract void tampilkanBahanBahan();
    
    // Method yang bisa digunakan oleh semua child classes
    public void mulaiMemasak() {
        System.out.println("Mulai memasak " + nama);
        System.out.println("Waktu persiapan: " + waktuMasak + " menit");
        System.out.println("Porsi: " + porsi + " orang");
    }
}