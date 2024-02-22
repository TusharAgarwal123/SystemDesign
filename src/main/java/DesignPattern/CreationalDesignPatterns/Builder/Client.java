package DesignPattern.CreationalDesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Customer c1 = new CustomerBuilder().firstName("Tushar")
                .lastName("Agrawal")
                .primaryEmail("xyz@gmail.com")
                .build();

        Customer c2 = new CustomerBuilder().firstName("Rohit")
                .lastName("Sharma")
                .primaryMobileNumber("1234567890")
                .build();

        System.out.println(c1);
        System.out.println(c2);
    }
}
