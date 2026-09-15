
import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjam;
    private String tanggal;
    private AnggotaPanitia peminjam;
    private ArrayList<Peralatan> daftarAlat;

    public Peminjaman(String idPeminjam, String tanggal, AnggotaPanitia peminjam){
        this.idPeminjam = idPeminjam;
        this.tanggal = tanggal;
        this.peminjam = peminjam;
        this.daftarAlat = new ArrayList<>();
    }
    public void tambahAlat(Peralatan alat){
            daftarAlat.add(alat);
    } 
    public void cetakStrukPeminjaman(){
        System.out.println("== BUKTI PEMINJAMAN ALAT ==");
        System.out.println("ID Transaksi    : " + idPeminjam);
        System.out.println("Tanggal         : " + tanggal );
        System.out.println("Peminjam        : " + peminjam.getInfoPanitia());
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Daftar Alat Yang Dipinjam   :");

        if (daftarAlat.isEmpty()) {
            System.out.println("- Belum Ada List -");
        } else {
            for(int i = 0; i < daftarAlat.size(); i++){
                System.out.println((i+1) + ". " + daftarAlat.get(i).getInfoAlat());
            }
        } System.out.println("===========================\n");
    }

}