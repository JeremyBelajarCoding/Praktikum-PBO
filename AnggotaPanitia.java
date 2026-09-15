public class AnggotaPanitia {
    private String nama;
    private String nim;
    private String divisi;

    public AnggotaPanitia(String nama, String nim, String divisi){
        this.nama = nama;
        this.nim = nim;
        this.divisi = divisi;
    }
    public String getInfoPanitia(){
        return nama + " / " + nim + " (Divisi " + divisi + ")";
    }
} 
