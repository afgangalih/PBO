package TUGAS;

public class Segitiga {
    private int sudut = 180;

    // method overloading
    public int totalSudut(int sudutA) {
        return sudut - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return (sisiA * sisiA + sisiB * sisiB); // r pythagoras
    }
}