package QUIZ1.number1;
public class Product {
    private int productId;
    private double productPrice; 
    private String productType;

    public Product(int productId, double productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public double getProductPrice() { return productPrice; }
    public void setProductPrice(double productPrice) { this.productPrice = productPrice; }

    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    public void addProduct() {
        System.out.println("Produk baru ditambahkan.");
    }
    
    public void modifyProduct() {
        System.out.println("Produk " + productId + " berhasil dimodifikasi.");
    }
    
    public void selectProduct(int productId) {
        System.out.println("Produk " + productId + " dipilih.");
    }
}

