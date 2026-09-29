package Jobsheet6.assignment;

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

    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setPekerjaan(String pekerjaan) { this.pekerjaan = pekerjaan; }

    public void printInfo() {
        super.printInfo();
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
