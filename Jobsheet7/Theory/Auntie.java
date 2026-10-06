package Jobsheet7.Theory;

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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Hobi Craft: " + this.hobiCraft);
    }

    @Override
    public void kegiatanHarian() {
        System.out.println(this.nama + " sedang membuat karya kerajinan " + this.hobiCraft + " di ruang kreasi.");
    }

    public String getHobiCraft() {
        return this.hobiCraft;
    }

    public void setHobiCraft(String hobiCraft) {
        this.hobiCraft = hobiCraft;
    }
}
