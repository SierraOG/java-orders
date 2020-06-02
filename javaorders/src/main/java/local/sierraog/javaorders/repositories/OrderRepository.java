package local.sierraog.javaorders.repositories;

import local.sierraog.javaorders.models.Customer;
import local.sierraog.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Customer, Long>
{
    Order findByIdContainingIgnoreCase(long id);
}
