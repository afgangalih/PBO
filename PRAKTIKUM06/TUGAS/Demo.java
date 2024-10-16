package TUGAS;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // buat list bahan kue
        List<String> bahanKue = new ArrayList<>();
        bahanKue.add("Tepung");
        bahanKue.add("Telur");
        bahanKue.add("Gula");
        bahanKue.add("Mentega");

        // buat list bahan minuman
        List<String> bahanMinuman = new ArrayList<>();
        bahanMinuman.add("Air");
        bahanMinuman.add("Gula");
        bahanMinuman.add("Es");

        // instansiasi objek chilc class kue dengan bahan
        ResepKue kue1 = new ResepKue("Kue Coklat", 45, 6, 180, "Renyah di luar, lembut di dalam", bahanKue);
        kue1.mulaiMemasak();
        kue1.panggang();

        // instansiasi objek child class minuman dengan bahan
        ResepMinuman minuman1 = new ResepMinuman("Es Tech", 30, 2, true, bahanMinuman);
        minuman1.mulaiMemasak();
        minuman1.sajikan();
    }
}
