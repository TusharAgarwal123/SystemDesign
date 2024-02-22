package DesignPattern.StructuralDesignPatterns.Proxy;

public class EmployeeProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDaoImpl;

    EmployeeProxy(){
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoImpl.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoImpl.delete(client,empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoImpl.get(client,empId);
        }
        throw new Exception("Access Denied");
    }
}
