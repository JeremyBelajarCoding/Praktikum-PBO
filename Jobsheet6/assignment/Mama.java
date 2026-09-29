package Jobsheet6.assignment;

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

    public void setMasakanFavorit(String masakanFavorit) {
        this.masakanFavorit = masakanFavorit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Masakan: " + masakanFavorit);
    }
}

