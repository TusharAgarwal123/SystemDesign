package DesignPattern.CreationalDesignPatterns.Builder;

public interface ICustomerBuilder {

    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder middleName(String middleName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder primaryEmail(String primaryEmail);
    ICustomerBuilder secondaryEmail(String secondaryEmail);
    ICustomerBuilder primaryMobileNumber(String primaryMobileNumber);
    ICustomerBuilder secondaryMobileNumber(String secondaryMobileNumber);

}
