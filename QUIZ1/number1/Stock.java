package QUIZ1.number1;

class Stock {
    private Product product;
    private int quantity;
    private int shopNo;

    public Stock(Product product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getShopNo() { return shopNo; }
    public void setShopNo(int shopNo) { this.shopNo = shopNo; }

    public void addStock() {
        System.out.println("Stok untuk produk ditambahkan sebanyak " + quantity);
    }
    
    public void modifyStock(int productId) {
        System.out.println("Stok untuk produk ID " + productId + " dimodifikasi.");
    }
    
    public void selectStockItem(int productId) {
        System.out.println("Item stok untuk produk ID " + productId + " dipilih.");
    }
}

