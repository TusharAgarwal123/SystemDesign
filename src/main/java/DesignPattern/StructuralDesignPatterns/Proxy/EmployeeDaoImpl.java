package DesignPattern.StructuralDesignPatterns.Proxy;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created new row in employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Deleted row in employeeId "+empId);
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        System.out.println("Fetching data from DB");
        return new EmployeeDo();
    }
}
