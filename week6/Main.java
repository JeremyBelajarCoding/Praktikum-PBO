package week6;

public class Main {
    public static void main(String[] args) {
        System.out.println(" === Data Mama === ");
        Mama mama1 = new Mama("Putri", "Paat", "Malang", "Rendang");
        mama1.infoMama();
        
        System.out.println(" === Data Uncle === ");
        Uncle uncle1 = new Uncle("Melvin", "Paat", "Bali", "Konstraktor");
        uncle1.infoUncle();

        System.out.println(" === Data Auntie === ");
        Auntie auntie1 = new Auntie("Tiara", "Paat", "Bali", "Rajut & Origami");
        auntie1.infoAuntie();
    }
}
