package PERCOBAAN;
public class InheritanceDemo {
    public static void main(String[] args) {
        // Dosen dosen1 = new Dosen();
        // dosen1.nama = "Yansy Ayuningtyas";
        // dosen1.nip = "34329837";
        // dosen1.gaji = 3000000;
        // dosen1.nidn = "1989432439";

        // System.out.println(dosen1.getAllInfo());
        // System.out.println(dosen1.getInfo());


        Dosen dosen2 = new Dosen("34329837", "Yansy Ayuningtyas", 3000000, "1989432439");

        
        
        //LANGKAH NO. 2 PERCOBAAN 6
        System.out.println(dosen2.getAllInfo());



    }
}
