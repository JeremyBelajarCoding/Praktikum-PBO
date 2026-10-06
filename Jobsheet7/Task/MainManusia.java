package Jobsheet7.Task;

public class MainManusia {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();
        
        System.out.println("== Implementasi Dynamic Method Dispatch ==");
        
        manusia1.bernafas();
        manusia2.bernafas();
        
        System.out.println();
        
        manusia1.makan(); 
        manusia2.makan(); 
        System.out.println();
        
        System.out.println("== Memanggil Method Spesifik ==");
    
        Dosen dosen = (Dosen) manusia1;
        dosen.lembur();
        
        Mahasiswa mhs = (Mahasiswa) manusia2;
        mhs.tidur();
    }
}



