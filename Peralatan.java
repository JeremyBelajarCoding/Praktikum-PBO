public class Peralatan {
    private String kodeAlat;
    private String namaAlat;
    private String kategori;

    public Peralatan(String kodeAlat, String namaAlat, String kategori){
        this.kodeAlat = kodeAlat;
        this.namaAlat = namaAlat;
        this.kategori = kategori;
    }
    public String getInfoAlat(){
        return kodeAlat + "-" + namaAlat + "(Kategori = " + kategori + ")";
    }
}
