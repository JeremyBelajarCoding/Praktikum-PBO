package Jobsheet7.Theory;

public class Granpa {
    protected String nama;
    protected final String marga;
    protected String alamat;

    public Granpa() {
        this.nama = "Belum diisi";
        this.marga = "Belum diisi";
        this.alamat = "Belum diisi";
    }

    public Granpa(String nama, String marga, String alamat) {
        this.nama = nama;
        this.marga = marga;
        this.alamat = alamat;
    }

    public void printInfo() {
        System.out.println("Nama   : " + this.nama);
        System.out.println("Marga  : " + this.marga);
        System.out.println("Alamat : " + this.alamat);
    }

    public void printInfo(String anggota) {
        System.out.println("=== " + anggota + " ===");
        this.printInfo(); 
    }

    public void kegiatanHarian() {
        System.out.println(this.nama + " sedang duduk santai di depan rumah");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
