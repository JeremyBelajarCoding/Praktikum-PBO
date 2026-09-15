public class demo {
    public static void main(String[] args) {
       
        AnggotaPanitia panitia1 = new AnggotaPanitia("Nabel", "25410706", "Pubdekdok");
        AnggotaPanitia panitia2 = new AnggotaPanitia("adiknya Nabel", "35341", "Perlengkapan");
        AnggotaPanitia jeremy = new AnggotaPanitia("Jeremy", "254107060121", "Sie acara");
        
        
        Peralatan kamera = new Peralatan("CAM-01", "Kamera DSLR", "Dokumentasi");
        Peralatan riceCooker = new Peralatan("RC-01", "Rice Cooker", "Konsumsi");
        Peralatan mic = new Peralatan("MIC-01", "Mic", "Audio");
        Peralatan kabelRoll = new Peralatan("KR-01", "Kabel Roll", "Listrik");
        Peralatan proyektor = new Peralatan("PE-01", "Proyektor", "Multimedia");
        Peralatan Handphone = new Peralatan("HP-01", "Infinix", "Gadget");
        

        Peminjaman transaksiNabel = new Peminjaman("awokawok01", "14", panitia1);
        
        transaksiNabel.tambahAlat(kamera);
        transaksiNabel.tambahAlat(riceCooker);
        transaksiNabel.tambahAlat(mic);
        

        Peminjaman transaksiAndi = new Peminjaman("awokawok02", "14", panitia2);
        
        transaksiAndi.tambahAlat(kabelRoll);
        transaksiAndi.tambahAlat(proyektor);

        Peminjaman transaksiJeremy = new Peminjaman("awokawok03", "15", jeremy);
        transaksiJeremy.tambahAlat(Handphone);
        
        transaksiNabel.cetakStrukPeminjaman();
        transaksiAndi.cetakStrukPeminjaman();
        transaksiJeremy.cetakStrukPeminjaman();
    }
}