package TUGAS;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        // Dynamic Method Dispatch
        manusia1.makan();  // Output: Dosen sedang makan.
        manusia2.makan();  // Output: Mahasiswa sedang makan.

        manusia1.bernafas(); // Output: Manusia sedang bernafas.
        manusia2.bernafas(); // Output: Manusia sedang bernafas.

        // Downcasting to access specific methods
        Dosen dosen = (Dosen) manusia1;
        dosen.lembur();  // Output: Dosen sedang lembur.

        Mahasiswa mahasiswa = (Mahasiswa) manusia2;
        mahasiswa.tidur();  // Output: Mahasiswa sedang tidur.
    }
}
