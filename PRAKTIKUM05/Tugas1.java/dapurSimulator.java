public class dapurSimulator {
    public static void main(String[] args) {
        ResepKue kueCoklat = new ResepKue("Brownies", 45, 8, 180, "Lembut dan moist");
      

        System.out.println("=== Membuat Kue ===");
        kueCoklat.mulaiMemasak();
        kueCoklat.tampilkanBahanBahan();
        kueCoklat.panggang();

       
    }
}