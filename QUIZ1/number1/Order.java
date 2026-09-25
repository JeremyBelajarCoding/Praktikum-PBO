package QUIZ1.number1;
import java.util.Date;
import java.util.ArrayList;

class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products; 
    private double amount;
    private Date orderDate;

    public Order(int orderId, Customer customer, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.products = new ArrayList<>();
        this.amount = 0.0;
    }

    public int getOrderId() { 
        return orderId; 
    }
    public void setOrderId(int orderId) { 
        this.orderId = orderId; 
    }
    public Customer getCustomer() { 
        return customer; 
    }
    public void setCustomer(Customer customer) { 
        this.customer = customer; 
    }
    public ArrayList<Product> getProducts() { 
        return products; 
    }
    public double getAmount() { 
        return amount; 
    }
    public Date getOrderDate() { 
        return orderDate; 
    }
    public void setOrderDate(Date orderDate) { 
        this.orderDate = orderDate; 
    }

    public void addProductToOrder(Product product) {
        this.products.add(product);
        this.amount += product.getProductPrice(); 
    }

    public void createOrder() {
        System.out.println("Order " + orderId + " untuk customer " + customer.getCustomerName() + " berhasil dibuat.");
    }
    
    public void editOrder(int orderId) {
        System.out.println("Order " + orderId + " sedang diedit.");
    }
}