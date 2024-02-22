package DesignPattern.StructuralDesignPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        try{
            EmployeeDao employee = new EmployeeProxy();
            employee.create("ADMIN", new EmployeeDo());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
