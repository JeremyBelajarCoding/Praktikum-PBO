package week6;

public class Granpa {
    private String nama;
    private String marga;
    private String alamat;

    public Granpa(String nama, String marga, String alamat) {
        this.nama = nama;
        this.marga = marga;
        this.alamat = alamat;
    } 
    public void infoGranpa(){
        System.out.println("Nama    :" + nama);
        System.out.println("Marga   :" + marga);
        System.out.println("Alamat  :" + alamat);
    }
}
