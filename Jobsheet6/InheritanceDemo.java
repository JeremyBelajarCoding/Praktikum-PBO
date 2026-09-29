package Jobsheet6;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yanay Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 30000000;
        dosen1.nidm = "189432439";
        
        System.out.println(dosen1.getAllInfo());;

    }
}
