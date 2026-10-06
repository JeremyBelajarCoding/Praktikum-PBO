package Jobsheet7.Theory;

public class Uncle extends Granpa {
    private String pekerjaan;

    public Uncle() {
        super();
        this.pekerjaan = "Belum diisi";
    }

    public Uncle(String nama, String marga, String alamat, String pekerjaan) {
        super(nama, marga, alamat);
        this.pekerjaan = pekerjaan;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Profesi: " + this.pekerjaan);
    }

    @Override
    public void kegiatanHarian() {
        System.out.println(this.nama + " sedang dinas di kantor menjalankan tugas sebagai " + this.pekerjaan + ".");
    }

    public void bekerja() {
        System.out.println(nama + " sedang fokus bekerja menyelesaikan tugas kantor.");
    }

    public void bekerja(int jam) {
        System.out.println(nama + " lembur bekerja selama " + jam + " jam hari ini.");
    }

    public String getPekerjaan() {
        return this.pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
