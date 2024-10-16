package jobsheet03;

public class Motor {

    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    private int batasKecepatanMaksimal = 100; // Batas kecepatan maksimal

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==================================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setMesinOn(boolean mesinOn) {
        isMesinOn = mesinOn;
    }

    // public void setKecepatan(int kecepatan) {
    //     if (!this.isMesinOn && kecepatan > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     } else if (kecepatan > batasKecepatanMaksimal) {
    //         System.out.println("Kecepatan tidak boleh lebih dari " + batasKecepatanMaksimal);
    //     } else {
    //         this.kecepatan = kecepatan;
    //     }
    // }

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif");
        } else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > batasKecepatanMaksimal) {
            System.out.println("Kecepatan tidak boleh lebih dari " + batasKecepatanMaksimal);
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
