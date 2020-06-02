package local.sierraog.javaorders.repositories;

import local.sierraog.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository
    extends CrudRepository<Customer, Long>
{
    Customer findByIdContainingIgnoreCase(long id);

    List<Customer> findByNameContainingIgnoreCase(String likename);
}
