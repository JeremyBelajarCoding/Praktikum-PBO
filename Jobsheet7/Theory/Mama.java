package Jobsheet7.Theory;

public class Mama extends Granpa {
    private String masakanFavorit;

    public Mama() {
        super(); 
        this.masakanFavorit = "Belum diisi";
    }

    public Mama(String nama, String marga, String alamat, String masakanFavorit) {
        super(nama, marga, alamat); 
        this.masakanFavorit = masakanFavorit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Masakan: " + this.masakanFavorit);
    }

    @Override
    public void kegiatanHarian() {
        System.out.println(nama + " sedang menyiapkan bumbu dan memasak " + masakanFavorit + " di dapur.");
    }

    public void masak() {
        System.out.println(nama + " memasak di dapur.");
    }

    public void masak(int porsi) {
        System.out.println(nama + " memasak " + masakanFavorit + " sebanyak " + porsi + " porsi untuk jeremy seorang.");
    }

    public String getMasakanFavorit() {
        return this.masakanFavorit;
    }

    public void setMasakanFavorit(String masakanFavorit) {
        this.masakanFavorit = masakanFavorit;
    }
}
