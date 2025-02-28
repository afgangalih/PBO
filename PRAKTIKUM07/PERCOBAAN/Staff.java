package PERCOBAAN;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    //overloading
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("\nNIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Gol: " + this.getGolongan());
        System.out.println("Jml Lembur: " + this.getLembur());
        System.out.printf("Gaji Lembur: %.0f\n", this.getGajiLembur());  
        System.out.printf("Gaji: %.0f\n", this.getGaji());  // 
    }
    

}
