package TUGAS;

import java.util.List;

public class ResepKue extends Resep {    
    private int suhu;
    private String tekstur;

    // Constructor tanpa parameter
    public ResepKue() {
        super();  // memanggil constructor tanpa parameter dari parent class
        this.suhu = 0;
        this.tekstur = "Tidak diketahui";
    }

    // Constructor berparameter
    public ResepKue(String nama, int waktuMasak, int porsi, int suhu, String tekstur, List<String> bahan) {
        super(nama, waktuMasak, porsi, bahan);  // memanggil constructor berparameter dari parent class
        this.suhu = suhu;
        this.tekstur = tekstur;
    }
    
    public void panggang() {
        System.out.println("Memanggang kue pada suhu " + suhu + "°C");
        System.out.println("Tekstur: " + tekstur);
    }
}
