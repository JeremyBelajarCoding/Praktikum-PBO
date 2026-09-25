package QUIZ1.number2;

public class Employee {
    private String employeeId;
    private String name;
    private String position;

    public Employee(String employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    public String getEmployeeId() { 
        return employeeId; 
    }
    public void setEmployeeId(String employeeId) { 
        this.employeeId = employeeId; 
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getPosition() { 
        return position; 
    }
    public void setPosition(String position) { 
        this.position = position; 
    }
}

class ServiceTransaction {
    private Vehicle vehicle;
    private Service service;
    private Employee mechanic;

    public ServiceTransaction(Vehicle vehicle, Service service, Employee mechanic) {
        this.vehicle = vehicle;
        this.service = service;
        this.mechanic = mechanic;
    }

    public double totalCost() {
        double totalCost = service.getServicePrice();
        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            totalCost += 50000;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            totalCost += 20000;
        }
        return totalCost;
    }

    public void printReceipt() {
        System.out.println("=====================================");
        System.out.println("Customer Name  : " + vehicle.getOwner().getName());
        System.out.println("Vehicle Info   : " + vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getPlateNumber() + ")");
        System.out.println("Vehicle Type   : " + vehicle.getVehicleType());
        System.out.println("Mechanic Name  : " + mechanic.getName());
        System.out.println("Service Detail : " + service.getServiceName());
        System.out.println("Estimated Cost : Rp " + totalCost());
        System.out.println("=====================================\n");
    }
}



