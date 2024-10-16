package TUGAS1;

public class KebunBinatangDemo {
    public static void main(String[] args) {
        
        
        KebunBinatang kb = new KebunBinatang("Kebun Binatang Malang");
        kb.namaKebunBinatang();
        //ganas
        Hewan kucing = new Hewan("Kitty", "Kucing", 2);
        Hewan gajah = new Hewan("Dumbo", "Gajah", 5);
        Hewan singa = new Hewan("Simba", "Singa", 3);
        Hewan kodok = new Hewan("Dodo", "Kodok", 1);
        Hewan orangutan = new Hewan("asep", "kodok", 1);

   

        
        kb.tambahHewanKeKB(kucing);
        kb.tambahHewanKeKB(gajah);
        kb.tambahHewanKeKB(singa);
        kb.tambahHewanKeKB(kodok);
        

        
        Kandang kandang1 = new Kandang(1, 4);
        

       
        kb.tambahKandang(kandang1);
       
        kb.tampilkanFooterKandang();

       
        kandang1.tambahHewanKandang(kucing);
        kandang1.tambahHewanKandang(gajah);
        kandang1.tambahHewanKandang(singa); 
        kandang1.tambahHewanKandang(kodok);
        kandang1.tambahHewanKandang(orangutan);



       
        kandang1.lihatDaftarHewanKandang();
      
        
    }
}
