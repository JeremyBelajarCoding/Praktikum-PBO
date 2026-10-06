package Jobsheet7.Task;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        System.out.println("Total Sudut (1 param): " + s.totalSudut(60));
        System.out.println("Total Sudut (2 param): " + s.totalSudut(60, 45));
        
        System.out.println("Keliling (3 param): " + s.keliling(3, 4, 5));
        System.out.printf("Sisi Miring / Keliling (2 param): %.2f\n", s.keliling(3, 4));
    }
}
