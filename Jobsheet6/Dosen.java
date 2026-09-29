package Jobsheet6;

public class Dosen extends Pegawai {
    public String nidm;

    public Dosen(){ 
        System.out.println("Objek dari class Dosen dibuat");
    }
    public String getAllInfo(){
        String info = "";
        info += "NIP         : " + super.nip + "\n";
        info += "nama        : " + super.nama + "\n";
        info += "Gaji        : " + super.gaji + "\n";
        info += "NIDM        : " + this.nidm + "\n";

        return info; 
    }
}
