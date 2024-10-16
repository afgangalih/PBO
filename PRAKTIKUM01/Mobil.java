public class Mobil {
    public static void main(String[] args) {

        String merk1, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        String type1, type2, type3, type4, type5, type6, type7, type8, type9, type10;
        String warna1, warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
        
        int kecepatan1, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;

        merk1 = "Toyota";
        type1 = "Avanza";
        warna1 = "Hitam";
        kecepatan1 = 40;

        merk2 = "Honda";
        type2 = "Civic";
        warna2 = "Abu-abu";
        kecepatan2 = 50;

        merk3 = "Nissan";
        type3 = "Altima";
        warna3 = "Merah";
        kecepatan3 = 60;

        merk4 = "Mitsubishi";
        type4 = "Pajero";
        warna4 = "Biru";
        kecepatan4 = 20;

        merk5 = "Mazda";
        type5 = "Mazda 3";
        warna5 = "Kuning";
        kecepatan5 = 30;

        merk6 = "Suzuki";
        type6 = "Ertiga";
        warna6 = "Hijau";
        kecepatan6 = 40;

        merk7 = "Daihatsu";
        type7 = "Sigra";
        warna7 = "Hijau";
        kecepatan7 = 50;

        merk8 = "Mazda";
        type8 = "Mazda 6";
        warna8 = "Hijau";
        kecepatan8 = 60;

        merk9 = "Hyundai";
        type9 = "Elantra";
        warna9 = "Hitam";
        kecepatan9 = 70;

        merk10 = "Chevrolet";
        type10 = "Cruze";
        warna10 = "Merah";
        kecepatan10 = 50;

        kecepatan1 = speedUp(kecepatan1, 10);
        kecepatan2 = speedUp(kecepatan2, 10);
        kecepatan3 = speedUp(kecepatan3, 10);
        kecepatan4 = speedUp(kecepatan4, 10);
        kecepatan5 = speedUp(kecepatan5, 10);
        kecepatan6 = reduceSpeed(kecepatan6, 10);
        kecepatan7 = reduceSpeed(kecepatan7, 10);
        kecepatan8 = reduceSpeed(kecepatan8, 10);
        kecepatan9 = reduceSpeed(kecepatan9, 10);
        kecepatan10 = reduceSpeed(kecepatan10, 10);

        System.out.println("===== Mobil =====");
        System.out.println("\nMerk\t: " + merk1);
        System.out.println("Type\t: " + type1);
        System.out.println("Warna\t: " + warna1);
        System.out.println("Kecepatan\t: " + kecepatan1 + " km/jam");

        System.out.println("\nMerk\t: " + merk2);
        System.out.println("Type\t: " + type2);
        System.out.println("Warna\t: " + warna2);
        System.out.println("Kecepatan\t: " + kecepatan2 + " km/jam");

        System.out.println("\nMerk\t: " + merk3);
        System.out.println("Type\t: " + type3);
        System.out.println("Warna\t: " + warna3);
        System.out.println("Kecepatan\t: " + kecepatan3 + " km/jam");

        System.out.println("\nMerk\t: " + merk4);
        System.out.println("Type\t: " + type4);
        System.out.println("Warna\t: " + warna4);
        System.out.println("Kecepatan\t: " + kecepatan4 + " km/jam");

        System.out.println("\nMerk\t: " + merk5);
        System.out.println("Type\t: " + type5);
        System.out.println("Warna\t: " + warna5);
        System.out.println("Kecepatan\t: " + kecepatan5 + " km/jam");

        System.out.println("\nMerk\t: " + merk6);
        System.out.println("Type\t: " + type6);
        System.out.println("Warna\t: " + warna6);
        System.out.println("Kecepatan\t: " + kecepatan6 + " km/jam");

        System.out.println("\nMerk\t: " + merk7);
        System.out.println("Type\t: " + type7);
        System.out.println("Warna\t: " + warna7);
        System.out.println("Kecepatan\t: " + kecepatan7 + " km/jam");

        System.out.println("\nMerk\t: " + merk8);
        System.out.println("Type\t: " + type8);
        System.out.println("Warna\t: " + warna8);
        System.out.println("Kecepatan\t: " + kecepatan8 + " km/jam");

        System.out.println("\nMerk\t: " + merk9);
        System.out.println("Type\t: " + type9);
        System.out.println("Warna\t: " + warna9);
        System.out.println("Kecepatan\t: " + kecepatan9 + " km/jam");

        System.out.println("\nMerk\t: " + merk10);
        System.out.println("Type\t: " + type10);
        System.out.println("Warna\t: " + warna10);
        System.out.println("Kecepatan\t: " + kecepatan10 + " km/jam");
    }

    public static int speedUp(int speedUp, int increment) {
        speedUp += increment;
        return speedUp;
    }

    public static int reduceSpeed(int reduceSpeed, int decrement) {
        reduceSpeed -= decrement;
        return reduceSpeed;
    }
}
