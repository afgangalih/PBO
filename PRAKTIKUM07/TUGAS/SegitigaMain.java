package TUGAS;

public class SegitigaMain {
    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();

        System.out.println("Total Sudut (sudutA): " + segitiga.totalSudut(60));
        System.out.println("Total Sudut (sudutA + sudutB): " + segitiga.totalSudut(60, 30));
        System.out.println("Keliling (sisiA, sisiB, sisiC): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (sisiA, sisiB): " + segitiga.keliling(3, 4));
    }
}
