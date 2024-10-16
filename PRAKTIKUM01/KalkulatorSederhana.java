import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== Kalkulator Sederhana =====");
        System.out.print("Masukkan angka pertama: ");
        int angka1 = in.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char opr = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int angka2 = in.nextInt();

        int hasil = hitung(angka1, opr, angka2);

        System.out.println("Hasil: " + angka1 + " " + opr + " " + angka2 + " = " + hasil);

    }

    public static int hitung(int angka1, char opr, int angka2) {
        switch (opr) {
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Gagal bro! Pembagian dengan nol tidak diperbolehkan.");
                    return 0;
                }
                return angka1 / angka2;
            default:
                System.out.println("Operatornya gak ada!");
                return 0;
        }
    }
}
