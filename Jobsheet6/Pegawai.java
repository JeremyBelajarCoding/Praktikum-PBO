package Jobsheet6;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai(){
        System.out.println("Objek dari class pegawai dibuat");
    }

    public String getInfo(){
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "nama        : " + nama + "\n";
        info += "Gaji        : " + gaji + "\n";

        return info;
    }
}
