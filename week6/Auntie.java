package week6;

public class Auntie extends Granpa {
    private String hobiCraft;
    
    public Auntie(String nama, String marga, String alamat, String hobiCraft) {
        super(nama, marga, alamat);
        this.hobiCraft= hobiCraft;
    } public void infoAuntie(){
        super.infoGranpa();
        System.out.println("Hobi Crafting   : " + hobiCraft);
    }
}
