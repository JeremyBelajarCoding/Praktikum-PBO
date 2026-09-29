package Jobsheet6.assignment;

public class Auntie extends Granpa {
    private String hobiCraft;

    public Auntie() {
        super();
        this.hobiCraft = "Belum diisi";
    }

    public Auntie(String nama, String marga, String alamat, String hobiCraft) {
        super(nama, marga, alamat);
        this.hobiCraft = hobiCraft;
    }

    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setHobiCraft(String hobiCraft) { this.hobiCraft = hobiCraft; }

    public void printInfo() {
        super.printInfo();
        System.out.println("Hobi Craft: " + hobiCraft);
    }
}
