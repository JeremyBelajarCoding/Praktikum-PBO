package Jobsheet6.assignment;

public class Demo {

public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" 1. INSTANSIASI DENGAN PARAMETERIZED CONSTRUCTOR");
        System.out.println("=========================================");
        
        Mama mama1 = new Mama("Siti", "Paat", "Malang", "Rendang");
        Uncle uncle1 = new Uncle("Budi", "Paat", "Surabaya", "Software Engineer");
        Auntie auntie1 = new Auntie("Dewi", "Paat", "Jakarta", "Origami");

        System.out.println("[Data Mama]");
        mama1.printInfo();
        System.out.println("\n[Data Uncle]");
        uncle1.printInfo();
        System.out.println("\n[Data Auntie]");
        auntie1.printInfo();

        System.out.println("\n=========================================");
        System.out.println(" 2. INSTANSIASI DENGAN PARAMETERLESS CONSTRUCTOR");
        System.out.println("=========================================");
        
        Mama mama2 = new Mama();
        System.out.println("Data Mama Sebelum Modifikasi");
        mama2.printInfo();

        System.out.println("\n=========================================");
        System.out.println(" 3. MODIFIKASI NILAI ATRIBUT (Poin 6)");
        System.out.println("=========================================");
        
        mama2.setNama("Siti Rahma");
        mama2.setAlamat("Batu");
        mama2.setMasakanFavorit("Soto Ayam");

        System.out.println("[Data Mama Setelah Modifikasi]");
        mama2.printInfo();
    }
}
