package QUIZ1.number2;

public class Main {
    public static void main(String[] args) {
        Employee mechanic1 = new Employee("1", "Jeremy Maranatha", "Senior Mechanic");
        Employee mechanic2 = new Employee("2", "Levi Karya wijaya", "Mechanic");

        Service oilChange = new Service("Oil Change", 150000);
        Service fullService = new Service("Full Service", 300000);
        Service brakeFix = new Service("Brake Pad Replacement", 100000);

        Customer cust1 = new Customer("John Cina", "08123456789");
        Customer cust2 = new Customer("DANIEL CHRISTIAN WIBOWO TEKNIK MESIN", "088805457126");

        Vehicle car1 = new Vehicle("N 4250 AAI", "Toyota", "Avanza", "Car");
        Vehicle car2 = new Vehicle("N 0 W", "Honda", "Civic", "Car");
        Vehicle motor1 = new Vehicle("N 1234 XY", "Yamaha", "NMAX", "Motorcycle");
        Vehicle motor2 = new Vehicle("N 5362 AAV", "Honda", "BAJAJ", "Motorcycle");

        cust1.addVehicle(car1);
        cust1.addVehicle(motor1);
        cust2.addVehicle(car2);
        cust2.addVehicle(motor2);

        System.out.println("--- SISTEM INFORMASI BENGKEL MAJU MILIK SIR JEREMY---\n");

        ServiceTransaction trans1 = new ServiceTransaction(car1, fullService, mechanic1);
        trans1.printReceipt();

        ServiceTransaction trans2 = new ServiceTransaction(car2, oilChange, mechanic2);
        trans2.printReceipt();

        ServiceTransaction trans3 = new ServiceTransaction(motor1, oilChange, mechanic1);
        trans3.printReceipt();

        ServiceTransaction trans4 = new ServiceTransaction(motor2, brakeFix, mechanic2);
        trans4.printReceipt();
    }
}
