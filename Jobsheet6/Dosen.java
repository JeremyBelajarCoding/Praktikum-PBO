package Jobsheet6;

public class Dosen extends Pegawai {
    public String nidm;

    public Dosen(){ 
        System.out.println("Objek dari class Dosen dibuat");
    }
    public Dosen(String nip, String nama, double gaji, String nidn){
        System.out.println("Objek dari class dosen dibuat");
    }

    public String getInfo(){
        return "NIDM        : " + this.nidm + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();

        return info; 
    }
}
