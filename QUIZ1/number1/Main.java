package QUIZ1.number1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ORDER PROCESSING SYSTEM MILIK JEREMY MARANATHA ===\n");

        Customer customer1 = new Customer(101, "Melvin", "Jl. Sudimoro, Malang", "081233471034");
        customer1.addCustomer();

        Product product1 = new Product(1, 1500000.0, "Mesin Cuci Uang");
        Product product2 = new Product(2, 50000.0, "Hadiah Untuk Pasangan");
        product1.addProduct();
        product2.addProduct();

        Stock stock1 = new Stock(product1, 50, 1);
        Stock stock2 = new Stock(product2, 100, 1);
        stock1.addStock();

        System.out.println("\n----------------------------------------");

        Order order1 = new Order(67, customer1, new Date());
        
        order1.addProductToOrder(product1);
        order1.addProductToOrder(product2);
        
        order1.createOrder();

        System.out.println("\n===RINCIAN PESANAN===");
        System.out.println("ID Order     : " + order1.getOrderId());
        System.out.println("Tanggal      : " + order1.getOrderDate());
        System.out.println("Nama Customer: " + order1.getCustomer().getCustomerName());
        System.out.println("Alamat       : " + order1.getCustomer().getAddress());
        System.out.println("No. Telepon  : " + order1.getCustomer().getPhone());
        System.out.println("\nDaftar Item Dibeli:");
        
        for (Product p : order1.getProducts()) {
            System.out.println(" - ID Produk: " + p.getProductId() + " | Tipe: " + p.getProductType() + " | Harga: Rp " + p.getProductPrice());
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total Bayar  : Rp " + order1.getAmount());
        System.out.println("========================================");
    }
}
