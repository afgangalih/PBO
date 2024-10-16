public class ResepKue extends ResepMakanan {
    private int suhu; // dalam celsius
    private String tekstur;
    
    public ResepKue(String nama, int waktuMasak, int porsi, int suhu, String tekstur) {
        super(nama, waktuMasak, porsi);
        this.suhu = suhu;
        this.tekstur = tekstur;
    }
    
  
    public void tampilkanBahanBahan() {
        System.out.println("Bahan-bahan kue " + nama + ":");
        System.out.println("- Tepung terigu");
        System.out.println("- Gula");
        System.out.println("- Telur");
        System.out.println("- Mentega");
    }
    
    public void panggang() {
        System.out.println("Memanggang kue pada suhu " + suhu + "°C");
        System.out.println("Tekstur yang diharapkan: " + tekstur);
    }
}
