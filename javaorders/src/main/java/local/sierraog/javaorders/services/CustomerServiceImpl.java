package local.sierraog.javaorders.services;

import local.sierraog.javaorders.models.Customer;
import local.sierraog.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl
    implements CustomerService
{
    @Autowired
    private CustomerRepository customerrepos;

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> list = new ArrayList<>();
        customerrepos.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Customer findCustomerWithId(long id)
    {
        return customerrepos.findByIdContainingIgnoreCase(id);
    }

    @Override
    public  List<Customer> findCustomersWithLikeName(String likename)
    {
        return customerrepos.findByNameContainingIgnoreCase(likename);
    }
}
