package week6;

public class Uncle extends Granpa {
    private String pekerjaan;

    public Uncle(String nama, String marga, String alamat, String pekerjaan) {
        super( nama, marga, alamat);
        this.pekerjaan = pekerjaan;

    }
    public void infoUncle() {
         super.infoGranpa();
        System.out.println("Pekerjaan       : " + pekerjaan);
    }

}
