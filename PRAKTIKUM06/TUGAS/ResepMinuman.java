package TUGAS;

import java.util.List;

public class ResepMinuman extends Resep {
    private boolean dingin;  // simpan informasi dingin/tidak

    // Constructor tanpa parameter
    public ResepMinuman() {
        super();  
        this.dingin = false;
    }

    // Constructor berparameter
    public ResepMinuman(String nama, int waktuMasak, int porsi, boolean dingin, List<String> bahan) {
        super(nama, waktuMasak, porsi, bahan);  // 
        this.dingin = dingin;
    }

    public void sajikan() {
        if (dingin) {
            System.out.println("Menyajikan " + nama + " dalam keadaan dingin.");
        } else {
            System.out.println("Menyajikan " + nama + " dalam keadaan hangat.");
        }
    }
}
