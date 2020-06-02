package local.sierraog.javaorders.repositories;

import local.sierraog.javaorders.models.Agent;
import local.sierraog.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository
        extends CrudRepository<Customer, Long>
{
    Agent findByIdContainingIgnoreCase(long id);
}
