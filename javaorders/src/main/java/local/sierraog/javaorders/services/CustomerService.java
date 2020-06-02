package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();

    Customer findCustomerWithId(long id);

    List<Customer> findCustomersWithLikeName(String likename);
}
