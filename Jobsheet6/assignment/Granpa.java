package Jobsheet6.assignment;

public class Granpa {
    protected String nama;
    protected String marga;
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
        System.out.println("Nama   : " + nama);
        System.out.println("Marga  : " + marga);
        System.out.println("Alamat : " + alamat);
    }
}

