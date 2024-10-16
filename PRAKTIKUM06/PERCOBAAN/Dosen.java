package PERCOBAAN;

public class Dosen extends Pegawai {
    public String nidn;

    // LANGKAH NO. 1 PERCOBAAN 6 ##
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // System.out.println("Objek dari class Dosen dibuat");
    // }

    // LANGKAH NO. 1 PERCOBAAN 7 ##
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // this.nip = nip;
    // this.nama = nama;
    // this.gaji = gaji;
    // this.nidn = nidn;
    // }

    // LANGKAH NO.2 PERCOBAAN 7 ##
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    // super.nip = nip;
    // super.nama = nama;
    // super.gaji = gaji;
    // this.nidn = nidn;a
    // }

    // LANGKAH NO. 3 PERCOBAAN 7 ##
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     super();
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }

    // LANGKAH NO. 5 PERCOBAAN 7 ##
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //    this.nidn = nidn;
    //     super(nip, nama, gaji);

    // }

    // LANGKAH NO. 6 PERCOBAAN 7 ##
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
 
     }
       
       

    // public String getAllInfo() {
    // //LANGKAH NO 2 PERCOBAAN 5
    // // String info = this.getInfo();

    // // LANGKAH 4
    // // info += "NIP : " + this.nip + "\n";
    // // info += "Nama : " + this.nama + "\n";
    // // info += "Gaji : " + this.gaji + "\n";
    // // info += "NIDN : " + this.nidn + "\n";

    // // info += "NIP : " + nip + "\n";
    // // info += "Nama : " + nama + "\n";
    // // info += "Gaji : " + gaji + "\n";
    // // info += "NIDN : " + nidn + "\n";

    // //LANGKAH NO 6 & 8
    // // info += "NIP : " + super.nip + "\n";
    // // info += "Nama : " + super.nama + "\n";
    // // info += "Gaji : " + super.gaji + "\n";
    // // info += "NIDN : " + this.nidn + "\n";

    // // //LANKGAH NO.1 PERCOBAAN 5
    // // info += "NIDN : " + nidn;

    // //LANGKAH NO.3 PERCOBAAN 5
    // String info = super.getInfo();
    // info += "NIDN : " + nidn;

    // return info;
    // };

    // LANGKAH NO. 4 PERCOBAAN 5
    public String getInfo() {
        return "NIDN: " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }

}