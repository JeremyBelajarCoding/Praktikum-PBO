package Jobsheet7.Theory;

public class Demo {
    public static void main(String[] args) {
        Mama mama1 = new Mama("Siti", "Paat", "Malang", "Rendang goreng cap tikus");
        Uncle uncle1 = new Uncle("Budi", "Paat", "bALI", "Software Engineer");
        Auntie auntie1 = new Auntie("Dewi", "Paat", "Jakarta", "Origami & Rajut");

        mama1.printInfo("== MAMA ==");
        System.out.println();
        uncle1.printInfo("== UNCLE ==");
        System.out.println();
        auntie1.printInfo("== AUNTIE ==");
        System.out.println();

        mama1.masak();
        mama1.masak(5);
        uncle1.bekerja();
        uncle1.bekerja(3);
        System.out.println();

        Granpa granpa1 = new Granpa("Yohanes", "Paat", "Malang");
        granpa1.kegiatanHarian();
        mama1.kegiatanHarian();
        uncle1.kegiatanHarian();
        auntie1.kegiatanHarian();
        System.out.println();

    }
}
